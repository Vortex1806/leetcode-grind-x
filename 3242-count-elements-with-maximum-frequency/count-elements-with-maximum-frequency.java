class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maxFreq = 0;
        for (int num : nums) {
            int val = mpp.getOrDefault(num, 0) + 1;
            mpp.put(num, val);
            maxFreq = Math.max(maxFreq, val);
        }
        int resCnt = 0;

        for (int freq : mpp.values()) {
            if (freq == maxFreq) {
                resCnt += freq;
            }
        }
        return resCnt;
    }
}