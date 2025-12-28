class Solution {
    public int[] sumZero(int n) {
        int []ans = new int[n];
        int index=0;
        //we started the loop from i=1 to avoid duplicates of 0 as 0 is only needed for n=odd and till n/2 because it gives correct pairs
        for(int i=1; i<=n/2; i++){
            ans[index++]= i;
            ans[index++]=-i;

            if(n%2!=0){
                ans[index]=0;
            }
        }
        return ans;
    }
}