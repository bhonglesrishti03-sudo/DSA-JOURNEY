class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int low = 0, high = removable.length;
        int ans = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if(isValid(s, p, removable, mid)){
                ans = mid;
                low = mid + 1;   // try for larger k
            } else {
                high = mid - 1;  // reduce k
            }
        }

        return ans;
}
 public boolean isSubsequence(String s, String p, boolean[] removed){
        int i = 0, j = 0;

        while(i < s.length() && j < p.length()){

            // skip removed characters
            if(removed[i]){
                i++;
                continue;
            }

            if(s.charAt(i) == p.charAt(j)){
                j++;
            }
            i++;
        }

        return j == p.length();
    }

  
    public boolean isValid(String s, String p, int[] removable, int k){

        boolean[] removed = new boolean[s.length()];

        // mark first k indices as removed
        for(int i = 0; i < k; i++){
            removed[removable[i]] = true;
        }

        return isSubsequence(s, p, removed);
    }
}
