class Solution {
    public int myAtoi(String s) {
       //what we need to do in thus question lets see
       //1) Remove the leading spaces not all spaces.
       //2) Handle signs.
       //3) Skip zeroes you dont need that in your answer if you reach at the end of the string and still there is no digit then return 0 as the answer.
       //4) Convert the characters to digits.
      // 5)Handle overflow.
      int i =0;
      int n = s.length();
      int result=0;
      int sign = 1;
      //handle leading spaces
      while( i <n && s.charAt(i)==' '){
        i++;
      }
      //handle sign
      if(i < n && (s.charAt(i)=='+' || s.charAt(i) == '-')){
        if (s.charAt(i) == '-') {
                sign = -1;
            }
           
              i++;
      }
      //now we need to look at non digits and digits
      while(i < n && Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i) - '0' ;//ASCII WAY
        //handle overflow
        if(result > (Integer.MAX_VALUE - digit)/10){
            return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
          result = result * 10 + digit;
            i++;
      }
     return result*sign;
    }
}
