class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int r = 0;
        int highestFreq = 0;
        int maxi = 0;

        while(r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            if(freq[s.charAt(r) - 'A'] > highestFreq) 
                highestFreq = freq[s.charAt(r) - 'A'];
            while((r-l+1) - highestFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxi = Math.max(maxi, (r-l+1));
            r++;
        }
        return maxi;
    }
}