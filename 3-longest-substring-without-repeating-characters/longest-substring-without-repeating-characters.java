class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSize = 0;
        int curSize = 0;
        int r = 0;
        int l = 0;
        HashSet<Character> mpp = new HashSet<>();

        while(r != s.length()) {
            char ch = s.charAt(r);
            if(mpp.contains(ch)) {
                while(mpp.contains(ch)) {
                    mpp.remove(s.charAt(l));
                    l++;
                }
                mpp.add(s.charAt(r));
                r++;
            } else {
                mpp.add(s.charAt(r));
                r++;
                maxSize = Math.max(maxSize, r-l);
            }
        }
        return maxSize;
    }
}