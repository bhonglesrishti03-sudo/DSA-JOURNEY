class Solution {
    public int subarraySum(int[] nums, int k) {
    //optimized version is using map as it helps us to check fast and see the prefixsum
    //so we knwo that prefixSum[j] - prefixSum[i]=k that means prefixSum[i] = prefixSum[j]-k
    HashMap<Integer , Integer> map = new HashMap<>();
    map.put(0,1); //this is a very imp line as this gives the sum before index 0 that means with this line only you start to check from index 0 for a sum
    int sum =0;
    int count=0;
    for(int num:nums){
        //  nums = [1,1,1], k = 2 
        //sum = 1
        sum+=num;
        int target = sum - k;
        //target = 1 - 2 = -1
        //map.containKey(-1)--> false 
        if(map.containsKey(target)){
            count+=map.get(target);
        }
        //just update the map
    map.put(sum, map.getOrDefault(sum, 0) + 1);
    //map.put(1 , 1)
    }
    return count;
    }
}