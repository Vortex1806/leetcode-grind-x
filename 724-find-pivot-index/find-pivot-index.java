class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n+1];
        for(int i = 0; i < n; i++) pref[i+1] = pref[i] + nums[i];
        for(int i = 0; i < n; i++) {
            int left = pref[i];
            int right = pref[n]-pref[i+1];
            if(left==right)return i;
        }
        return -1;
    }
}