class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] arr = new int[2051];
       for(int[] log:logs){
        arr[log[0]]++;
        arr[log[1]]--;
       }
      int curr=0;
      int max=0;
      int ans= 1950;
      for(int year = 1950; year<=2050; year++){
        curr+= arr[year];

        if (curr > max) {
        max = curr;
        ans = year;
      }
      }
      return ans;
    }
}