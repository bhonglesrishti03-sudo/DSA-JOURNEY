class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0; i<n; i++){
        list.add(index[i], nums[i]);
       }
       int[]arr = new int[list.size()];
       for(int i=0; i<list.size(); i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
}