class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        mpps={}
        mppt={}
        for ch in s:
            mpps[ch] = mpps.get(ch, 0) + 1
        for ch in t:
            mppt[ch] = mppt.get(ch, 0) + 1

        return mpps == mppt