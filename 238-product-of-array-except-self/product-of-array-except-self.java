class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0] = 1;
        post[n-1] = 1;
        for(int i = 0; i < n-1; i++) {
            pre[i+1] = pre[i] * nums[i];
        }
        for(int i = n-1; i > 0; i--) {
            post[i-1] = post[i] * nums[i];
        }

        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * post[i];
        }
        return ans;
    }
}