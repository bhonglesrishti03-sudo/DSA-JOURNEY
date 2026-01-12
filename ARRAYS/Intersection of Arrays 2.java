class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // count frequency of nums1
        for (int num : nums1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // check nums2 against freq map
        for (int num : nums2) {
            if (freq.getOrDefault(num, 0) > 0) {
                ans.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }

        // convert to array
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
