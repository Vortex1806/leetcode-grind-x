class Solution:
    def lower_bound(self, nums, target):
        n = len(nums)
        l, r = 0, n - 1
        ans = n

        while l <= r:
            mid = (l + r) // 2

            if nums[mid] >= target:
                ans = mid
                r = mid - 1
            else:
                l = mid + 1

        return ans

    def upper_bound(self, nums, target):
        n = len(nums)
        l, r = 0, n - 1
        ans = n

        while l <= r:
            mid = (l + r) // 2

            if nums[mid] > target:
                ans = mid
                r = mid - 1
            else:
                l = mid + 1

        return ans

    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left = self.lower_bound(nums, target)

        if left == len(nums) or nums[left] != target:
            return [-1, -1]

        right = self.upper_bound(nums, target) - 1

        return [left, right]