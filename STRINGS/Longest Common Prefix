class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs == null || strs.length == 0){
        return "";
      }
      String prefix = strs[0];
      for(int i = 1 ; i < strs.length;i++){
        prefix = commonPrefix(strs[i], prefix);

        if(prefix.length()==0){
            return "";
        }
      }
      return prefix;
    }
    static String commonPrefix(String a , String b){
        int i = 0 , j =0;
        while(i < a.length() && j < b.length()){
            if(a.charAt(i) != b.charAt(j)){
                break;
            }
            i++;
            j++;
        }
        return a.substring(0,i);
    }
}
