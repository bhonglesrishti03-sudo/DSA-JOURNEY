class Solution {
    public boolean isAnagram(String s, String t) {
        //same hahsmap version an be altered in the array form
        int[]freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch -'a']++;
        }
         for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freq[ch -'a']--;
        }
        for(int count:freq){
            if(count!=0)return false;
        }
        return true;
    }
}
