class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxlen = 0;
        for(int right = 0; right < s.length(); right++) {
            int ind = s.charAt(right)-'A';
            count[ind]++;
            maxFreq = Math.max(maxFreq, count[ind]);
            while(right-left+1-maxFreq > k) {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;

    }
}