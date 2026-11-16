class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int longest = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if(mpp.containsKey(c) && mpp.get(c) >= left) {
                left = mpp.get(c) + 1;
            }
            mpp.put(c, right);
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}