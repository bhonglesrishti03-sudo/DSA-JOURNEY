class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       // in the better approach we can use two hashset and we can fix three elements and find the third term but this is not up to mark hence the best approach is using two pointers
       /*
For applyin two pointers in 4sum we can derive the same approach like two pointers in 3sum here we can fix two elements and the rest will be assigned as left and right
*/
int n = nums.length;
List<List<Integer>> list = new ArrayList<>();
Arrays.sort(nums);
for(int i = 0; i<n-3;i++){
      if (i > 0 && nums[i] == nums[i - 1]) continue;
    for(int j = i+1 ; j<n-2;j++){
          if (j > i+1 && nums[j] == nums[j - 1]) continue;
        int left = j+1;
        int right = n-1;
        while(left<right){
            long sum  = (long)nums[i] + nums[j] + nums[left] + nums[right];//we use long to avoid integer overflow
            if(sum == target){
                list.add(Arrays.asList(nums[i], nums[j],nums[left],nums[right]));
                 while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }
}
return list;
    }
}