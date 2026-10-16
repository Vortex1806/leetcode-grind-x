class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        # reset = {}
        # for word in strs:
        #     sorted_word = ''.join(sorted(word))
        #     if sorted_word not in reset:
        #         reset[sorted_word] = []
        #     reset[sorted_word].append(word)
        # return [grouped_list for keys, grouped_list in reset.items()]

        # reset = defaultdict(list)
        # for word in strs:
        #     sorted_word = ''.join(sorted(word))
        #     reset[sorted_word].append(word)
        # return list(reset.values())

        result = defaultdict(list)
        for word in strs:
            hashval = [0] * 26
            for ch in word:
                hashval[ord(ch)-ord('a')] += 1
            result[tuple(hashval)].append(word)
        return list(result.values())