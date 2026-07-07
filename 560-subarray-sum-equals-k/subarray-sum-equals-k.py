class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        freq = {0: 1}

        prefix = 0
        cnt = 0

        for num in nums:
            prefix += num

            if prefix - k in freq:
                cnt += freq[prefix - k]

            freq[prefix] = freq.get(prefix, 0) + 1

        return cnt