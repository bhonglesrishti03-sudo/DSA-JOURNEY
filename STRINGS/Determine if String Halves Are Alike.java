class Solution {
    public boolean halvesAreAlike(String s) {
       int count = 0;

        for(int i = 0; i < s.length()/2; i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1) count++;
            if("aeiouAEIOU".indexOf(s.charAt(i + s.length()/2)) != -1) count--;
        }

        return count == 0;
    } 
}
