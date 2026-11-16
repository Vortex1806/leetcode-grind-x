class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i< k; i++) {
            sum += nums[i];
        }
        int best = sum;
        for(int right = k; right < n; right++) {
            sum += nums[right];
            sum -= nums[right-k];
            best = Math.max(best, sum);
        }
        return (double) best/ (double)k;
    }
}