class Solution {
    public int minEatingSpeed(int[] piles, int h) {
   //what all things are provided to us we have given piles of bananas the guard comes in h hours to koko has h hours to finish all bananas also speed of koko is k each hour like for every 1 hour she choose some pile and eats k bananas which is basically here eating speed like 1 banana/per hour so here k = 1 now suppose if the pile has k bananas or less then k bananas then definetly koko can finish them all so in all we just need to return k here we can again see that we need a numeric answer again the answer lies in a range of low and high we can validate that answer so yes its binary search on answer.
   int low = 1;
   int high = max(piles);
   while(low<high){
    int mid = low + (high - low)/2;
    if(isValid(piles,mid,h)){
        high = mid;
    }else{
        low = mid+1;
    }
   }
   return low;
     }
     static int max(int[]piles){
        int max = piles[0];
       for(int i =1;i<piles.length;i++){
        max = Math.max(max,piles[i]);
       }
       return max;
     }
     static boolean isValid(int[]piles,int mid,int h){
       int hours=0;
       for(int p:piles){
        hours+=(p+mid - 1)/mid;
         if (hours > h) return false;
       }
       return true;
     }
    
}