public class BINARYSEARCH {
    public static void main(String[] args) {
    int[]arr = {12 , 14, 16, 18, 20, 22,24};
    int target = 22;
    int ans = binarySearch(arr,target);
    System.out.println(ans);
   }

static int binarySearch(int[]arr, int target){
       int start=0;
       int end= arr.length-1;

       while(start<=end){
           //int mid = (start + end)/2; this does overflow this may exceed the int range
           int mid = start+ (end - start)/2;
           // this is same as start+ end/2 do simple maths s + e-s/2 ==> 2s +e-s/2 --> s+e/2

           if(target<arr[mid]){
               end = mid-1;
           }else if(target>arr[mid]){
               start = mid+1;
           }else{
               return mid;
           }

       }
       return -1;
   }
}