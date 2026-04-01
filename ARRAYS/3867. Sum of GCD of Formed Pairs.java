class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
    //iterate over your array 
        int[] max = maxArray(nums);
        int[]prefixGcd = new int[nums.length];
        for(int i=0;i<prefixGcd.length;i++){
            prefixGcd[i] = gcd(nums[i],max[i]);
        }
        //now we need to do pairing
        Arrays.sort(prefixGcd);
        long sum = 0;
        int left = 0 , right = n -1;
        while(left < right){
            sum+= gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
 return sum;
    }
    static int gcd(int a, int b){
    while(b != 0){
        int temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a);
}
    static int[] maxArray(int[]nums){
        int[]max = new int[nums.length];
        max[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            max[i] = Math.max(max[i-1],nums[i]);
        }
        return max;
    }
}
