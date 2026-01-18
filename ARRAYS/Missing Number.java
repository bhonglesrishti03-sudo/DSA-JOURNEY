class Solution {
    public int singleNumber(int[] nums) {
    //another way is solve by the method xor
    int missingNumber =0;
    for(int num:nums){
       missingNumber^=num;
    }
    return missingNumber;
    }
}