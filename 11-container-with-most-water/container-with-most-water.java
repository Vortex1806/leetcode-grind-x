class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxi = 0;
        while(l < r) {
            int h = Math.min(height[l], height[r]);
            int area = h * (r-l);
            if(area > maxi) maxi = area;
            if(height[l] == height[r]) {
                l++;
                r--;
            }else if(height[l] < height[r]) l++;
            else r--;
        }
        return maxi;
    }
}