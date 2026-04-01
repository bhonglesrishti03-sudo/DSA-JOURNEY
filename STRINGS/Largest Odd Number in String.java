class Solution {
    public String largestOddNumber(String s) {
       //see an odd number can be found when its last digit will be an odd number like for even the last digit will be an even number .
     //start iterating from end 
     for(int i= s.length() - 1 ; i>=0 ;i--){
       char ch = s.charAt(i);
       if( (ch - '0') %2 !=0){
        return s.substring(0,i+1);
       }
     } 
       return "";
    }
}
