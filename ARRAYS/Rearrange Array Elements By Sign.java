class Solution {
    public int[] rearrangeArray(int[] nums) {
  //brute force approach
  //divide the main array in two halves or two arrays and then just place one positive and one negative number 
  int[]positiveArray = new int[nums.length/2];
  int[]negativeArray = new int [nums.length/2];
  
        int p = 0, q = 0;
  for(int i=0;i<nums.length; i++){
    if(nums[i] >0){
        positiveArray[p++] = nums[i];
    }else{
        negativeArray[q++] = nums[i];
    }
  }
    int index=0;
    int[]ans = new int[nums.length];
    for(int i=0; i<ans.length/2; i++){
        ans[index++]=positiveArray[i];
        ans[index++]=negativeArray[i];
    }
  return ans;
    }
 }
