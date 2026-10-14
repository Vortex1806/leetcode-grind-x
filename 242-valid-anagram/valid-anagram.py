class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        # return sorted(s) == sorted(t)

        # mpps, mppt = {}, {}
        # for i in range(len(s)):
        #     mpps[i] = mpps.get(s[i], 0) + 1
        #     mppt[i] = mppt.get(t[i], 0) + 1
        # return mpps == mppt

        freq = [0] * 26
        for ch in s:
            freq[ord(ch) - ord('a')] += 1
        for ch in t:
            freq[ord(ch) - ord('a')] -= 1
        for val in freq:
            if val != 0:
                return False
        return True