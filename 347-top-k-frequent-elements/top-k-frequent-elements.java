class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val: nums) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        // List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(freq.entrySet());
        // entries.sort((a, b) -> b.getValue() - a.getValue());
        // PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        // for(var entry: freq.entrySet()) {
        //     pq.offer(entry);
        //     if(pq.size() > k) {
        //         pq.poll();
        //     }
        // }

        List<Integer> bucket[] = new List[nums.length+1];
        for(var entry: freq.entrySet()) {
            int val = entry.getValue();
            if(bucket[val] == null) bucket[val] = new ArrayList<>();
            bucket[val].add(entry.getKey());
        }
        int x = 0;
        int res[] = new int[k];
        for(int i = bucket.length-1; i >= 0; i--) {
            if(bucket[i] != null) {
                for(int j = 0; j < bucket[i].size(); j++) {
                    res[x++] = bucket[i].get(j);
                    if(x==k)break;
                }
            }
            if(x==k)break;
        }
        return res;
    }
}