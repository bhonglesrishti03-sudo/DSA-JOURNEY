 class Solution{
    public static void main(String[]args){
        //It is basically the greatest number smaller or = target
       int[]arr = {2,3,5,9,14,16,18};
       int target = 14;
       System.out.println(floorOfANumber(arr,target));
    }
    static int floorOfANumber(int[]arr, int target){
       int start=0, end = arr.length-1;
       while(start<=end){
           int mid = start + (end -start)/2;
           if(target ==arr[mid]){
               return arr[mid];
           }else if(target >arr[mid]){
             start = mid+1;
           }else{
               end = mid -1;
           }
       }
       return arr[end];
   }
 }