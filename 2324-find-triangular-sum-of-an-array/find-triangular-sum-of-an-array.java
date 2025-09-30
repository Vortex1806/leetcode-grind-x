class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return nums[0];
        int n = nums.length;
        for(int j = 0; j < n; j++)  {
            for(int i = 0; i < n - j - 1; i++) {
                nums[i] =(nums[i] + nums[i+1])%10;
            }
        }
        return nums[0];
    }
}