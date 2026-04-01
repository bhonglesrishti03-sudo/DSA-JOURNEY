class Solution {
    public int repeatedStringMatch(String a, String b) {
    // see we need to keep repeating a until it reaches the length of b or more or just atleat the length of b becuase anything will only be contained in it when the length of the repeated string will be greater then b or for any edge case we need to append 1 more time actually for boundary case
    StringBuilder sb = new StringBuilder();
    int count = 0;
    while(sb.length() < b.length()){
    sb.append(a);
    count++;
    }
   if(KMP(sb.toString(), b)) return count;
   sb.append(a);
   if(KMP(sb.toString(), b)) return count+1;
   return -1;
    }
    static boolean KMP(String text , String b){
        int n = text.length();
        int m = b.length();
        int i =0;
        int j =0;
        int[]lps = buildLPS(b);
        while(i < n){
            if(text.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            //pattern found
            if(j==m){
               return true;
            }
            else if(i<n && text.charAt(i) != b.charAt(j)){
                if(j!=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        return false;
    }
    static int[] buildLPS(String b){
        int m = b.length();
        int[]lps = new int[m];
        int len = 0;
        int i=1;
        while(i<m){
            if(b.charAt(i) == b.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len  = lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
}
