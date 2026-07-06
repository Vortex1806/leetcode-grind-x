class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums) + 1

        freq = [0] * n

        for i in range(n-1):
            freq[nums[i]] += 1
        for i in range(n):
            if freq[i] == 0:
                return i
        return -1
        