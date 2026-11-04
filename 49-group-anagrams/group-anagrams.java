class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(String str: strs) {
            char[] carr = str.toCharArray();
            // Arrays.sort(carr);
            // String key = new String(carr);
            int[] freq = new int[26];
            for(int i = 0; i < carr.length; i++) {
                freq[carr[i] - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int val: freq) {
                sb.append(val).append("#");
            }
            String key = sb.toString();
            if(!mpp.containsKey(key)) {
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(str);
        }

        return new ArrayList<>(mpp.values());
    }
}