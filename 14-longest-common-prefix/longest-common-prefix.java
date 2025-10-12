class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Iterate character by character in the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // Compare this character with all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index exceeds length or mismatch found, return prefix till i
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If loop completes, entire first string is common prefix
        return strs[0];
    }
}
