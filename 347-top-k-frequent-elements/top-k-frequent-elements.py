class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        hashmap = {}
        for num in nums:
            hashmap[num] = 1 + hashmap.get(num,0)

        freq = [[] for i in range(len(nums)+1)]
        for num, count in hashmap.items():
            freq[count].append(num)

        result = []
        
        for i in range(len(freq)-1, 0, -1):
            for num in freq[i]:
                if len(result) < k:
                    result.append(num)
                else:
                    break
        return result