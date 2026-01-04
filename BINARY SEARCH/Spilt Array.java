int spiltArray(int[]nums, int k){
        int start=0;
        int end= 0;
        //here we are stating from 0 for both
        for(int i=0; i<nums.length; i++){ // by using the for loop we calculate the max
            //which is basically the max element of the array
            start = Math.max(start, nums[i]);
            //and are end is basically the whole sum of the whole array
            end +=nums[i];
        }
        //binary search
        while(start < end){ // because loop end at start ==end
            int mid = start + (end - start)/2;
            int sum=0;
            int pieces=1;

            for(int num: nums){ // weare looping over the array
                if(sum+ num>mid){ //and checking if 0+ 7 > 21 --> false then add sum = 7
                    // then again 7+ 2 > 21 --> false then sum becomes 9 then again 9+ 5 > 21 nope add 5 to the sum
                    // 14 + 10 > 21 -> true so start a new sum with the num you are at present
                    //that is 10 and do piece ++ then piece becomes 2
                    sum= num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }
            //till here we get 2 pieces we can check are pieces > k actually false
            //then shrink the array to mid
            if(pieces>k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
//again start of start = 10  end = 21  mid = 15
        //[7,2,5]  [10]  [8]  this will be formed
        // pieces > k then we will just change are start to mid +1
        //start = 16 end =21 mid = 18
         //[7,2,5] [10,8]  end = mid then end =18
        //start = 16 end = 18 mid =17
        //[7,2,5] [10] [8]
        // start = 18  end = 18 here the loop ends we get the answer that is 18
        return end;
    }