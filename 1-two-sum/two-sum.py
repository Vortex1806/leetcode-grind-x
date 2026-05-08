class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap = {}

        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in hmap:
                return [i, hmap[rem]]
            hmap[nums[i]] = i
        return [0,0]