class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        pre, suf = 1, 1
        n = len(nums)
        ans = float("-inf")
        for i in range(n):
            if pre == 0:
                pre = 1
            if suf == 0:
                suf = 1
            pre *= nums[i]
            suf *= nums[n-i-1]
            ans = max(ans, pre, suf)
        return ans
