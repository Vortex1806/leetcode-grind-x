class Solution {


    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        int count[] = new int[128];
        for(int k = 0; k < t.length(); k++) count[t.charAt(k)]++;
        int startInd = 0;
        int best = Integer.MAX_VALUE;
        int left = 0;
        int missing = m;
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if(count[c] > 0) missing--;
            count[c]--;
            if(missing == 0) {
                while(count[s.charAt(left)] < 0) {
                    count[s.charAt(left)]++;
                    left++;
                }
                if(right-left+1< best) {
                    best = right-left+1;
                    startInd = left;
                }
                count[s.charAt(left)]++;
                missing++;
                left++;
            }
        }
        if(best == Integer.MAX_VALUE)return "";
        return s.substring(startInd, startInd + best);
    }
}