public class BINARYSEARCH {
    public static void main(String[] args) {
    int[]arr = {12 , 14, 16, 18, 20, 22,24};
    int target = 22;
      int ans = orderAgnosticBinarySearch(arr,target);
       System.out.println(ans);
   }
    static int orderAgnosticBinarySearch(int[]arr , int target){
       int start=0;
       int end= arr.length-1;
//find whether the array is sorted in ascending or descending
       boolean isASC =arr[start]< arr[end];
       while(start<=end) {
           //int mid = (start + end)/2; this does overflow this may exceed the int range
           int mid = start + (end - start) / 2;
           // this is same as start+ end/2 do simple maths s + e-s/2 ==> 2s +e-s/2 --> s+e/2
           if (arr[mid] == target) {
               return mid;
           }
           if (isASC) {
               if (target < arr[mid]) {
                   end = mid - 1;
               }
            else {
               start = mid + 1;
           }
       }else{
               if (target > arr[mid]) {
                   end = mid - 1;
               }
           else{
               start = mid + 1;
           }
       }
       }
       return -1;
   }
}

//This binary search helps us to determine whether the array we are searching is ascending or descending.