class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
    int low = min(bloomDay) , high = max(bloomDay);
    int ans =-1;
    while(low <= high){
        int mid = low+ (high - low)/2;
        if(isValid(bloomDay,mid,m,k)){
            ans  = mid;
            high = mid - 1;
        }else{
            low = mid+1;
        }
    }
    return ans;
    }
static int min(int[]bloomDay){
    int min = 0;
    for(int b:bloomDay){
min = Math.min(min,b);
    }
    return min;
}
static int max(int[]bloomDay){
    int max = 0;
    for(int b:bloomDay){
max = Math.max(max,b);
    }
    return max;
}
static boolean isValid(int[] bloomDay, int mid, int m, int k) {
        int bouquets = 0;
        int flowers = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; 
            }
        }
        return bouquets >= m;
    }
}