class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int num: nums) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a,b)-> b.getValue() - a.getValue());
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }
        return res;
        
    }

}