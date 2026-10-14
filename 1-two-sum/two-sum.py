class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i] + nums[j] == target:
        #             return [i, j]
        # return [-1, -1]

        val = {}
        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in val:
                return [val.get(rem), i]
            val[nums[i]] = i
        return [-1, -1]