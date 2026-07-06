class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor_val = 0
        for i in range(len(nums)):
            xor_val ^= nums[i]
        return xor_val