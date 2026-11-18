class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length(), n = s.length();
        if(m > n) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int tofind[] = new int[26];
        int cur[] = new int[26];

        for(int i = 0; i < m; i++) {
            tofind[p.charAt(i)-'a']++;
            cur[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(tofind, cur)){
            res.add(0);
        }
        for(int i = m; i < n; i++) {
            cur[s.charAt(i)-'a']++;
            cur[s.charAt(i-m)-'a']--;
            if(Arrays.equals(tofind, cur)) res.add(i-m+1);
        }

        return res;
    }
}