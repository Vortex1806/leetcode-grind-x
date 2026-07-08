class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        cnt = 0
        elem = nums[0]
        n = len(nums)
        for num in nums:
            if cnt == 0:
                elem = num
                cnt += 1
            elif elem == num:
                cnt += 1
            else:
                cnt -= 1
        elemcnt = nums.count(elem)
        if elemcnt >= (n // 2):
            return elem
        return -1