class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(String str: strs) {
            int[] freq = new int[26];
            for(int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int val: freq) {
                sb.append(val).append("#");
            }
            String key = sb.toString();
            mpp.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}