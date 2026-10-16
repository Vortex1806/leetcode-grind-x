class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        reset = {}
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in reset:
                reset[sorted_word] = []
            reset[sorted_word].append(word)
        return [grouped_list for keys, grouped_list in reset.items()]