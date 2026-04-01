class Solution {
    public int countSubstrings(String s) {
       //better solution
       //expand around center approach by this we can find palindromic substrings then count them
       //the optimized approach will use DP on Strings
       int count = 0;
       for(int i=0;i<s.length();i++){
        count += expand(s,i,i);
        count += expand(s,i,i+1);
        }
        return count;
    }
    public int expand(String s, int left, int right){

    int count = 0;

    while(left >= 0 && right < s.length()
          && s.charAt(left) == s.charAt(right)){

        count++;

        left--;
        right++;
    }

    return count;
    }
}
