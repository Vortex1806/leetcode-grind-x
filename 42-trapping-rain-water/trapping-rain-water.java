class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lmax = 0;
        int rmax = 0;
        int[] pre = new int[n];
        int[] post = new int[n];
        for(int i = 0; i < n; i++) {
            pre[i] = lmax;
            if(height[i] > lmax) lmax = height[i];
            post[n-i-1] = rmax;
            if(height[n-i-1] > rmax) rmax = height[n-i-1];
        }
        int totalWater = 0;
        for(int i = 0; i < height.length; i++) {
            if(Math.min(pre[i], post[i]) - height[i] > 0) {
                totalWater += Math.min(pre[i], post[i]) - height[i];
            }
        }
        return totalWater;
    }
}