 class Solution {
    public int[] productExceptSelf(int[] nums) {
        //optimized solution is using prefix and suffix 
        //prefix will always be i-1 th index and suffix i+1
        //so if i take the range of prefix and suffix they are respectively
        //prefix range---> 0 till i-1 and suffux range ---> i+1 till nums.length -1 //so we can calculate both seperately and make two functions prefix and suffix
        int n = nums.length;
        int[] ans = new int[n];

       
        ans[0] = 1; // nothing before index 0
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

      
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * suffix;
            suffix = suffix * nums[i];
        }

        return ans;
    }
}