class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int longest = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}