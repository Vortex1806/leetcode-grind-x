class Solution {
    public boolean canPartWithLimit(int[] nums, int k, int limit) {
        int parts = 1;
        int value = 0;
        for(int num: nums) {
            value += num;
            if(value > limit) {
                parts++;
                value = num;
            }
        }
        return parts <= k;
    }
    public int splitArray(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int x: nums) {
            if(x > max) max = x;
            total += x;
        }
        int low = max;
        int high = total;
        while(low < high) {
            int mid = low + (high-low)/2;
            if(canPartWithLimit(nums, k, mid)) high = mid;
            else low = mid +1;
        }
        return low;
    }
}