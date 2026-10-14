class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i] + nums[j] == target:
        #             return [i, j]
        # return [-1, -1]

        # val = {}
        # for i in range(len(nums)):
        #     rem = target - nums[i]
        #     if rem in val:
        #         return [val.get(rem), i]
        #     val[nums[i]] = i
        # return [-1, -1]

        final = []
        for idx, num in enumerate(nums):
            final.append([num, idx])
        final.sort()
        i, j = 0, len(nums)-1
        while(i < j):
            total = final[i][0] + final[j][0]
            if total == target:
                return [final[i][1], final[j][1]]
            elif total < target:
                i += 1
            else:
                j -= 1
        return [-1, -1]