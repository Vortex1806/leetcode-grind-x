class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freq = {}
        n = len(nums)
        for i in range(n):
            rem = target - nums[i]
            if rem in freq:
                return [freq[rem], i]
            freq[nums[i]] = i
        return [-1, -1]