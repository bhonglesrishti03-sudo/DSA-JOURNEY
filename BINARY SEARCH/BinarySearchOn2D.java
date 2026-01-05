 static int[] searchBinary2D(int[][]arr, int target){
       int row = 0;
       int column = arr.length -1;
       while(row < arr.length && column >=0){
           if(arr[row][column]==target){
               return new int[]{row,column};
           }
           if(arr[row][column] <target){
               row++;
           }else{
               column--;
           }
       }
       return new int[]{-1,-1};
   }