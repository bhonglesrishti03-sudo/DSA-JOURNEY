class Solution {
    public void sortColors(int[] arr) {
       //[2,0,2,1,1,0]----> [blue , red ,blue , white , white , red]
       //you nedd to make them [0,0,1,1,2,2] you need to basically sort everything
       //the first basic is actually using arrays.sort as the brute force
      //the second better approach is sorting step by step 
      //i can use various sorting methods insertion bubble or selection 
      //first trying with bubble sort actually all sorting algo will ahve same complexities so we can use any as brute
     for(int i=0; i<arr.length; i++){
     int last = arr.length-i-1;
     int maxIndex = getMaxIndex(arr,0,last);

     swap(arr, maxIndex,last);
 }
    }
     static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static int getMaxIndex(int[]arr, int start, int end){
       int max = start;
        for (int i = start; i <=end ; i++) {
            if(arr[max] < arr[i]){
             max = i;
            }
        }
        return max;
    }
}
    