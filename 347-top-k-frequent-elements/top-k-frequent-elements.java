class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val: nums) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = entries.get(i).getKey();
        }
        return res;
    }
}