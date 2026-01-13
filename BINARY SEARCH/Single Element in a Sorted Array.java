class Solution {
    public int singleNonDuplicate(int[] nums) {
  //now as the question wants us to solve in binary search we have to work accordingly
  //we can see in the array every element appears twice so when we start from index 0 index 0 ans 1 are same 2 complete then update index 2 and 3 should be same but in ex 1 we can see they are not so this can be a loop whole so if the element is basically now equals to index -1 and index+1 then we got that element so we know in binary search we find the target when it equals mid so we will add this case here
  //Index: 0 1 2 3 4 5 6 7 8
//Array: 1 1 2 3 3 4 4 8 8
//Before the single element → pairs start at even index
//After the single element → pairs start at odd index
//so if mid is even that means you are before the single element and if mid is odd that means you are past the single element

int start=0, end = nums.length-1;
while(start<end){
    int mid = start + (end -start)/2;
    //means you are past the single element and it will be on left
     if(mid%2==1){
      mid--;
     }
     //here this means we are on a pair
    if(nums[mid]==nums[mid+1]){
     start = mid+2;
    }else{
        end = mid;
    }
}

return nums[start];
    }
}
//dry run 
//nums = [1,1,2,3,3,4,4,8,8]
//start = 1          end=8    mid= 4
//here mid is even nums[4]=3  hence we know that the single element lies on the left half hence end=mid because mid can be a potential answer
//now the search space becomes start =1  end =4 mid = 2
//here mid is again even end = 2
//start =1  end =2 mid = 1
//here mid is odd and we know the pairs basically start from even index hence mid-- to go to even index and then return start so now mid = 0 start = mid+2 that is on 2 and end = 2 so here loop will end and we will return start.