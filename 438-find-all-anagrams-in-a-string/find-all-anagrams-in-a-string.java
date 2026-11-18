class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = p.length(), n = s.length();
        List<Integer> res = new ArrayList<>();
        char tofind[] = p.toCharArray();
        Arrays.sort(tofind);
        for(int i = 0; i <= n-m; i++) {
            char whatihave[] = s.substring(i, i+m).toCharArray();
            Arrays.sort(whatihave);
            if(Arrays.equals(tofind, whatihave)){
                res.add(i);
            }
        }
        return res;
    }
}