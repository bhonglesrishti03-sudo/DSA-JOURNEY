class Solution {
    public boolean search(int[] nums, int target) {
     //so in this question i can see that we have duplicates that means now we cant rely on pivot finding because suppose an array is [1,1,1,1,1,1] then here is basically no pivot hence a better option is dont find a pivot instead binary search normally give the duplicate check and when duplicates found just shrink the window and nothing more can be done
     //basically we need to check which half is sorted and then return the value

     int start= 0 , end = nums.length-1;
     while(start<=end){
        int mid= start +(end - start)/2;
        if(nums[mid]==target){
            return true;
        }
        if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }
            //left half is sorted
         else if(nums[start] <= nums[mid] ){
            if(target >= nums[start] && target < nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
         }
         else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
     }
     return false;
    }
}