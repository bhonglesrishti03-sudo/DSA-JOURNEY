class solution{
public static void main(String[]args){
//if the array is infinite we don't know the length of the array
     int[]arr = {3,5,6,7,8,10,11,12,15,20,23,30,33,44,55,66,77,88,99,100};
//      //assume this is an infinte array and we don't know its length
     int target= 15;
//      //so like N ---------> TO 1 in binary search in logN time and at every
//        //step it is reduced to N/2 so here we will go opposite bottom to top
//        //and therefore we will double the previous size at every step
       System.out.println(findingRange(arr,target));
}
  public int[] firstAndLast(int[]nums, int target){
       int []ans = {-1,-1};

     int start= search(nums, target,true );
     int end = search(nums, target, false);
     ans[0]=start;
     ans[1]=end;
     return ans;
   }
    static int findingRange(int[]arr, int target){
       //starting the range with a range of 2
       int start=0;
       int end=1;
       //condition for checking target lying in the range
       while(target > arr[end]){
           int newStart = end+1;
           end = end + (end- start + 1)*2;
           start = newStart;
       }
       return infiniteArray(arr, target, start, end);
   }

   static int infiniteArray(int[]arr, int target, int start, int end){
       while(start<=end){
           int mid = start + (end-start)/2;
           if(target<arr[mid]){
               end = mid-1;
           }else if(target > arr[mid]){
               start = mid+1;
           }else {
               return mid;
           }
       }
       return -1;
   }
   int search(int[]nums, int target, boolean findStartIndex){
       int ans =-1;
       int start=0, end = nums.length-1;
       while(start<=end){
           int mid = start + (end - start)/2;

            if(target < nums[mid]){
               end = mid-1;
           }else if(target > nums[mid]){
               start = mid+1;
           }else{
                ans = mid;

                    if(findStartIndex){
                        end = mid-1;
                    }else {
                        start = mid+1;
                    }
                }
            }

       return ans;
   }
}