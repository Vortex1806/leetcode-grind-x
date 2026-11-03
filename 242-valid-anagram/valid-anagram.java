class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int[] visited = new int[26];

        for(int i=0; i < s.length(); i++) {
            visited[s.charAt(i) - 'a']++;
            visited[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) if(visited[i] != 0)return false;
        return true;
    }
}