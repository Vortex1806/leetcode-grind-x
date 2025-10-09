class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i= 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> mpp.get(b) - mpp.get(a));

        for(int val : mpp.keySet()) {
            pq.add(val);
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}