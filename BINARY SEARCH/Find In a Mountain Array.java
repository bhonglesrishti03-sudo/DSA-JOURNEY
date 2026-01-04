 static int searchMountainArray(int[]arr, int target){
  int peak = peakElement(arr);
      int firstTry = orderAgnosticBinarySearch(arr, target,0 , peak);
      if(firstTry!=-1){
      return firstTry;
      }
  return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
   }
   static int peakElement(int[] arr) {
       int start = 0;
       int end = arr.length - 1;
       while (start < end) {
           int mid = start + (end - start) / 2;
           if (arr[mid] > arr[mid + 1]) {
               // you are in dec part of the array
               //this may be the ans but look at left
               //this is why end != mid-1
               end = mid;
           } else {
               //you are in the ascending part
               start = mid + 1;
           }
       }
       //int the end start = end and pointing to the largest number
       //because of the above two checks
       return start;
   }
static int orderAgnosticBinarySearch(int[]arr , int target, int start, int end){

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