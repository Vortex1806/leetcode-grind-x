class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pre = 1;
        int post = 1;
        ans[0] = pre;
        for(int i = 1; i < n; i++) {
            ans[i] = pre * nums[i-1];
            pre = ans[i];
        }
        for(int i = n-2; i >= 0; i--) {
            post = post * nums[i+1];
            ans[i] = ans[i] * post;
        }

        return ans;
    }
}