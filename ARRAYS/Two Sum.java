class Solution {
    public int[] twoSum(int[] nums, int target) {
       //better approach is instead of checking the same element again again if you get nums[i]then you just need to find target - nums[i] therfore when you have a key and a value go for hashmap
       HashMap<Integer,Integer> map = new HashMap<>();
       int n= nums.length;
       for(int i=0; i<n; i++){
        int seen = target-nums[i];
        if(map.containsKey(seen)){
             return new int[]{map.get(seen), i};
        }
        map.put(nums[i],i);
       }
       return new int[]{-1, -1};
    }
    }
