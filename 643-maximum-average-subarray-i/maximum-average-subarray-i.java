class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int prefix[] = new int[n+1];
        prefix[0] = 0;
        for(int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        int best = Integer.MIN_VALUE;

        for(int i = k; i <= n; i++) {
            best = Math.max(best, prefix[i]-prefix[i-k]);
        }
        return (double) best/ (double)k;
    }
}