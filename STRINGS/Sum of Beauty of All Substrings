class Solution {
    public int beautySum(String s) {
        //brute force approach
        //1) generate all substrings 
        //2) calculate the beauty of each substrings using a hashmap
        //3) sum up the beauty

        //generating all substrings
         int sum = 0;
        for(int i = 0 ; i< s.length(); i++){
           int[]freq = new int[26];
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                sum += beauty(freq);
            }
        }
       return sum;
    }
    static int beauty(int[]freq){
        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        for(int i = 0; i < 26; i++){

            if(freq[i] > 0){
                maxFreq = Math.max(maxFreq, freq[i]);
                minFreq = Math.min(minFreq, freq[i]);
            }
        }

        return maxFreq - minFreq;
    }
}
