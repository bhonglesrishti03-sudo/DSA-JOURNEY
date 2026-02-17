class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = upperBound(arr,target) - lowerBound(arr,target);
        return count;
    }
    static int upperBound(int[]arr,int target){
        int start = 0;
        int end  = arr.length;
        while(start<end){
            int mid = start+(end - start)/2;
            if(arr[mid] > target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int lowerBound(int[]arr,int target){
        int start = 0;
        int end  = arr.length;
        while(start<end){
            int mid = start+(end - start)/2;
            if(arr[mid] >= target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}
