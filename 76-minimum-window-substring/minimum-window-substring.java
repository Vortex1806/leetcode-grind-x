class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        int cnt = t.length();
        for(char ch : t.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        int l = 0;
        int sInd = 0;
        int minSize = Integer.MAX_VALUE;
        int r = 0;
        while(r < s.length()) {
            char ch = s.charAt(r);
            if(mpp.containsKey(ch)) {
                if(mpp.get(ch) > 0) cnt--;
                mpp.put(ch, mpp.get(ch) - 1);
            }            
            while(cnt == 0) {
                if(r-l+1 < minSize) {
                    minSize = r-l+1;
                    sInd = l;
                }
                char lchar = s.charAt(l);
                if(mpp.containsKey(lchar)) {
                    mpp.put(lchar, mpp.get(lchar) + 1);
                    if(mpp.get(lchar) > 0) cnt++;
                }
                l++;
            }   
            r++;
        }
        return minSize == Integer.MAX_VALUE ? "" : s.substring(sInd, sInd + minSize);
    }
}