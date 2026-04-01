class Solution {
    public int nextGreaterElement(int n) {
      //the optimized way of solving is by using next permutation concept
      //first find the breakpoint
      char[]arr = String.valueOf(n).toCharArray();
      int l = arr.length;
      int index = -1;
      for(int i = l - 2 ; i>=0 ;i--){
        if(arr[i] < arr[i+1]){
            index = i;
            break;
        }
      }
       if(index == -1){
       return -1;
       }
       //finsing the replacement element
       for(int i = l-1;i> index;i--){
        if(arr[i] > arr[index]){
            swap(arr,i,index);
            break;
        }
       }
        reverse(arr, index + 1, l - 1);
     long result  = Long.parseLong(new String( arr));  
       if(result > Integer.MAX_VALUE){
        return -1;
       }
       return(int) result;
      }
      static void reverse(char[]arr,int start,int end){
    while(start<end){
char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
static void swap (char[]arr, int a , int b){
    char temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
}
