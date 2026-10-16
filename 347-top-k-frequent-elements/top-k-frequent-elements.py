class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        hashmap = {}
        for num in nums:
            hashmap[num] = 1 + hashmap.get(num,0)

        heap = []
        for num, count in hashmap.items():
            heapq.heappush(heap, (count, num))
            if len(heap) > k:
                heapq.heappop(heap)

        result = []
        
        for i in range(k):
            result.append(heapq.heappop(heap)[1])
        return result