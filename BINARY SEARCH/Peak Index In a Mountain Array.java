 //PEAK INDEX IN A MOUNTAIN ARRAY
//
//                              6
//                         5          5
//                    4                    4
//                3                           3
//            2                                   2
//        1                                          1
        //6 is the peak element this is known as bitonic array its first
        //part is in ascending order and the second part is in descending order
        //it does not contain duplicate elements in an ascending part or second half
        //conditions:-
        /* if arr[mid] > arr[mid +1] then you are in descending part
        and else is that you are in ascending part of the array
        and when will the loop break?
        In the end both start and end will point to the same largest element
         */
    class Solution{
        public static void main(String[]args){
       int[] arr = {0, 1, 0};
       System.out.println(peakElement(arr));
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
    }