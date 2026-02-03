class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      // optimized way
      //in the optimized version we need to work with two pointers
      /*
      [-1,0,1,2,-1,-4] ----> [-4,-1,-1,0,1,2] first we need to sort to help in avoiding duplicates now we can fix i and check the rest sum 
      like nums[i]+nums[left]+ nums[right] = 0
      left = i + 1 right = nums.length - 1 and the range of i = 0 to n - 2
      i = 0 left = 1 right  = 5
      while(left<right){
        we need to check the sum
        int sum = nums[0] + nums[1]+ nums[5] = -4 -1 + 2 = -3
 so this will not be included in the list
i = 0 we will find the valid triplets hence in else cases like when sum < 0 then we do left++ and if sum>0 then right--
here i = 0 left = 2 right = 5
int sum = nums[0] + nums[2] + nums[5] ----> -4 - 1 + 2  = -3
again  i =0 left = 3 right = 5
int sum = nums[0] + nums[3] + nums[5] = -4 + 0 + 2 = -2
again i = 0 left = 4 right = 5
int sum = nums[0] + nums[4] + nums[5] ------> -4 + 1 + 2 = -1
again i = 0 left = 5 right = 5 -----> inner loop breaks
    }
[-4,-1,-1,0,1,2]
i = 1 left = 2 right = 5
int sum = nums[0] + nums[2] + nums[5] = -1 + -1 + 2 = 0
thsi will be added to the list and to avoid duplicacy if left == left + 1 then move left++ and if right  == right - 1 then move right --
here i = 1 left = 4 right = 4 again here the inner loop breaks

[-4,-1,-1,0,1,2]
i = 2 left = 3 right  = 5
int sum = nums[2] + nums[3] + nums[5] ----> -1 + 0 + 1 = 0
we will add thsi to the list now check for duplicacy
i = 2 left = 4 right = 4 -----> loop breaks

[-4,-1,-1,0,1,2]
i = 3 left = 4 right = 5
int sum = nums[3] + nums[4] + nums[5] ----> 0 + 1 + 2 = 3
i = 3 left = 4 right = 4 -------> loop breaks 

[-4,-1,-1,0,1,2]
i = 4 left = 5 right = 5 ----------> loop breaks 
hence we get the answers as [[-1,-1,2],[-1,0,1]]

nums = [0,0,0]
i = 0 left = 1 right = 2
sum = 0 we need to add this
the next loop will not run and also here all the elements are same hence we need to avoid the duplicacy of i also if (i > 0 && nums[i] == nums[i - 1]) continue;
      */
      List<List<Integer>> list  = new ArrayList<>();
      Arrays.sort(nums);
      int n = nums.length;
      for(int i=0; i<n-2;i++){
        if(i>0 && nums[i] == nums[i-1])continue;

        int left = i+1;
        int right = n-1;
        while(left<right){
            int sum = nums[i] + nums[left] + nums[right];
            if(sum == 0){
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));

                while(left < right && nums[left]==nums[left+1])left++;
                while(left<right && nums[right]== nums[right-1])right--;

                left++;
                right--;
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
      }
      return list;
    }
}