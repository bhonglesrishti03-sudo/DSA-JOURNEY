 class solution{
    public static void main(String[]args){
        int pivot = findPivot(nums);

        // if array is not rotated
        if (pivot == -1) {
            return nums[0];
        }

        // minimum is element after pivot
        return nums[pivot + 1];
    }
   

    int findPivot(int[]nums){
        int start =0, end = nums.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid]> nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>= nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
 }