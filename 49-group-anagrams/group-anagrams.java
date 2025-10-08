class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> mpp = new HashMap<>();
        
        for(String str : strs) {
            int[] arr = new int[26];
            Arrays.fill(arr, 0);
            for(int i = 0; i < str.length(); i++) {
                arr[str.charAt(i) - 'a']++;
            }
            StringBuilder keyStr = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                keyStr.append(arr[i]).append('#');  
            }
            String key = keyStr.toString();
            if(mpp.containsKey(key)) {
                mpp.get(key).add(str);
            } else {
                mpp.put(key, new ArrayList<>());
                mpp.get(key).add(str);
            }
        }
        for (String val : mpp.keySet()) {
            List<String> list = new ArrayList<>();
            for(String res : mpp.get(val)) {
                list.add(res);
            }
            ans.add(list);
        }
        return ans;
    }
}