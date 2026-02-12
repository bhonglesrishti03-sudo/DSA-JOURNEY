/*
Example 1:
Input:
 N = 6, array[] = {9, -3, 3, -1, 6, -5}  
Result:
 5  
Explanation:
 The following subarrays sum to zero:
- {-3, 3}
- {-1, 6, -5}
- {-3, 3, -1, 6, -5}
The length of the longest subarray with sum zero is 5.

Example 2:
Input:
 N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}  
Result:
 8  
Explanation:
 Subarrays with sum zero:
- {-2, 2}
- {-8, 1, 7}
- {-2, 2, -8, 1, 7}
- {6, -2, 2, -8, 1, 7, 4, -10}
The length of the longest subarray with sum zero is 8.
*/

//brute force approach
// class Solution{
//     public static void main(String[]args){
//         int[] array = {6, -2, 2, -8, 1, 7, 4, -10};
//         System.out.print(longestArraySum(array));
//     }
//     static int longestArraySum(int[]array){
//         int maxLen=0;
//         for(int i=0; i<array.length; i++){
//             int sum=0;
//             for(int j=i+1; j<array.length;j++){
//                 sum+=array[j];
//                 if(sum==0){
//                     maxLen = Math.max(maxLen,j-i+1);
//                 }
//             }
//         }
//         return maxLen;
//     }
// }

// better approach
//we can use a hashmap to check prefix sum
class Solution{
    public static void main(String[]args){
        int[] array = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.print(longestArraySum(array));
    }
    static int longestArraySum(int[]array){
        Map<Integer,Integer> map = new HashMap<>();
        int maxLen =0;
        int sum=0;
        for(int i=0; i<array.length;i++){
        sum+=array[i];
        if(sum == 0){
            maxLen = i+1;
        }
        if(map.contains(sum)){
            maxLen = Math.max(maxLen, i - map.get(sum));
        }else{
            map.put(sum,i);
        }
    }
    return maxLen;
}
}