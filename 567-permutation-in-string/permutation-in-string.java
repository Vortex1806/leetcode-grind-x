class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] str1 = new int[26];
        int[] str2 = new int[26];

        int windowSize = s1.length();

        for(int i = 0; i < windowSize; i++) {
            str1[s1.charAt(i) - 'a']++;
            str2[s2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s2.length() - windowSize; i++) {
            if(Arrays.equals(str1, str2)) return true;
            str2[s2.charAt(i + windowSize) - 'a']++;
            str2[s2.charAt(i) - 'a']--;
        }
        return Arrays.equals(str1, str2);
    }
}