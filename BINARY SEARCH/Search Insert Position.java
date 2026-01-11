class Solution {
    public int searchInsert(int[] nums, int target) {
          int start=0, end= nums.length;
          while(start < end){
            int mid= start + (end - start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end= mid;
            }else{
                start = mid+1;
            }
          }     
          return start;
          //testcase were it is failing 
          //[1,3] start = 1   end = 3
          //mid = 1 now condition will be checked here are target is greater then nums[mid] so our start will move start = 3 so it should return 1 so the problem in my code was i mixed two
//   tenplate A        templates start = 0
// end = n - 1
// while (start <= end)
//TEMPLATE B start = 0
// end = n
// while (start < end) 
//start = 0, end = 2
// mid = 1 → nums[1] = 3
// target < nums[mid] → end = mid - 1 = 0 



    }
}