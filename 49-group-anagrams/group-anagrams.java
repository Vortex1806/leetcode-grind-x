class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mpp = new HashMap<>();

        for(String str: strs) {
            int[] arr = new int[26];
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                sb.append(arr[i]).append('#');
            }
            String key = sb.toString();
            if(mpp.containsKey(key)) {
                mpp.get(key).add(str);
            } else {
                mpp.put(key, new ArrayList<>());
                mpp.get(key).add(str);
            }
        }
        for(String value: mpp.keySet()) {
                List<String> values = mpp.get(value);
                ans.add(values);
            }
        return ans;
    }
}