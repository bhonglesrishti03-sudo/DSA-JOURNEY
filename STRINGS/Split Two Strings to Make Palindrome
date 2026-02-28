class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
     return  check(a,b) || check(b,a);
    }
    static boolean check(String x , String y){
        int i = 0 , j = y.length() - 1;
         while (i < j && x.charAt(i) == y.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrome(x,i,j) || isPalindrome(y,i,j);
    }
    static boolean  isPalindrome (String a , int i , int j){
        while(i < j){
            if(a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
