class Solution {
    public boolean canTransform(String start, String result) {
       //so basically we need to skip "X" and only work for "R" and "L" when we encounter an "L" we need to move backwards and for right forward but we dont actually need to change the string the biggest thing here is not changing the string but stimulating the change and here X are empty positions that you need to skip
      //like after removing X from start we get "RLRRL" and result goes "RLRRL" now their position should match
      if(!start.replace("X", "").equals(result.replace("X", ""))){
            return false;
        }

        int i = 0, j = 0;
        int n = start.length();

        while(i < n && j < n){

            // skip X
            while(i < n && start.charAt(i) == 'X') i++;
            while(j < n && result.charAt(j) == 'X') j++;

            if(i == n && j == n) return true;

            if(start.charAt(i) != result.charAt(j)) return false;

            // checking movement rules
            if(start.charAt(i) == 'L' && i < j) return false;
            if(start.charAt(i) == 'R' && i > j) return false;

            i++;
            j++;
        }

        return true;



    }
}
