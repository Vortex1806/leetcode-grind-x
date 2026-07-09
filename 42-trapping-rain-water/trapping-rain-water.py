class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        l, r = 0, n-1
        lmax = 0
        rmax = 0
        twater = 0
        while(l < r):
            lmax = max(lmax, height[l])
            rmax = max(rmax, height[r])
            if height[l] < height[r]:
                l += 1
                if lmax - height[l] > 0:
                    twater += lmax - height[l]
            else:
                r-=1
                if rmax - height[r] > 0:
                    twater += rmax - height[r]
        return twater