class Solution {
    public boolean checkIfExist(int[] arr) {
        //brute force
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length;j++){
        //         if(i != j && arr[i] == 2 * arr[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // better approach is using binary search for bigger constraints
//         Arrays.sort(arr);
// for (int i = 0; i < arr.length; i++) {
//      // Avoid same index problem for 0
//             int left = (arr[i] == 0) ? i + 1 : 0;
//             int right = arr.length - 1;
//     if ( binarySearch(arr,2*arr[i],left,right)) {
//         return true;
//     }
// }
// return false;
HashSet<Integer> set = new HashSet<>();
for (int num : arr) {
    if (set.contains(2 * num) || (num % 2 == 0 && set.contains(num / 2))) {
        return true;
    }
    set.add(num);
}
return false;
    }
    // static boolean binarySearch(int[]arr,int target,int left,int right){

    //         while (left <= right) {
    //             int mid = left + (right - left) / 2;

    //             if (arr[mid] == target) {
    //                 return true;
    //             } else if (arr[mid] < target) {
    //                 left = mid + 1;
    //             } else {
    //                 right = mid - 1;
    //             }
    //         }
    //         return false;
   // }
}