class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxi = 0;
        while(r < s.length()) {
            char ch = s.charAt(r);
            while(l <= r && hs.contains(ch)) {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(ch);
            maxi = Math.max(maxi, r - l + 1);
            r++;
        }   
        return maxi;
    }
}