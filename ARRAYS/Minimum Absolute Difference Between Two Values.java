class Solution {
    public int minAbsoluteDifference(int[] nums) {
    int minDifference = Integer.MAX_VALUE;
    ArrayList<Integer> list1 = new ArrayList<>();
    for(int i = 0 ; i<nums.length; i++){
        if(nums[i] == 1){
            list1.add(i);
        }
    }
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i = 0 ; i<nums.length; i++){
        if(nums[i] == 2){
            list2.add(i);
        }
    }  
        //list1 = [0,5] and list2 = [3]
        //start iterating over the list and compute the difference
        for(int i = 0; i<list1.size(); i++){
            int difference = 0;
            for(int j = 0 ; j<list2.size(); j++){
                difference = Math.abs(list1.get(i) - list2.get(j));
                minDifference = Math.min(difference,minDifference);
            }
        }
        if(minDifference == Integer.MAX_VALUE){
            return -1;
        }
        return minDifference;
    }
}
/*
we need such pairs whose valyue are 1 and 2 that is nums[i] == 1 and nums[j] == 2 so basically in the nums take the index of numbers of values 1 and 2
nums = [1,0,0,2,0,1]
index 0 == value = 1
index 3 == value = 2
index 5 == value = 1
so the pairs that can be formed are (0,3)  and (5,3)
now we need to check the absolute difference of both the pairs and we need to return minimium of it.
1) Start iterating over the array.
2) Create an array of size 2.
a) If nums[i] == 1 store the index at arr[0].
b) If nums[i] == 0 skip 
and if nums[i] == 2 store the index at arr[1].

nums = [1,0,0,2,0,1]
i = 0 nums[i] = 1
ans = []
ans = [0,0]
i = 1 nums[i] = 0
ans = [0,0]
i = 2
again nothing move
i = 3
ans = [0,3] here your array got completely filled hence calculate abs and store in minDiiference
i = 4
move do nothing
i = 5
ans = [5,3] again your array is filled again calculate and update minDifference.

*/
