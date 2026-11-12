class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int curSum = 0;

        for(int i = 0; i < k; i++) {
            curSum += nums[i];
        }

        int maxSum = curSum;

        for(int i = k; i < n; i++) {
            curSum += nums[i];
            curSum -= nums[i-k];
            maxSum = Math.max(maxSum, curSum);
        }
        return (double)maxSum / k;
    }
}