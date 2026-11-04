class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val: nums) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        // List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        // entries.sort((a, b) -> b.getValue() - a.getValue());
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(var entry: freq.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        return res;
    }
}