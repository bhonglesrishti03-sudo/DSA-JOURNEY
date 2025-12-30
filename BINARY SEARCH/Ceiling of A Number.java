public class BINARYSEARCHQUESTIONS {
    public static void main(String[] args) {
    
       int[]arr = {2,3,5,9,14,16,18};
       int target =15;
       //in this array find the smallest number which is greater or
       //equal to the target element
       System.out.println(ceilingOfANumber(arr,target));
    }
     static int ceilingOfANumber(int[]arr, int target){
       int start=0, end= arr.length-1;
       boolean isASC =arr[start]< arr[end];
       while(start<=end){
           int mid = start+ (end - start)/2;
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
       if (isASC) {
           if (start < arr.length) {
               return arr[start];
           }
       } else {
           if (end >= 0) {
               return arr[end];
           }
       }

       return -1; // no ceiling exists

   }
}