class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int maxlen = 0;
        for(int x: nums) hs.add(x);
        for(int val: hs) {
            if(!hs.contains(val-1)) {
                int cur = val;
                int len = 0;
                while(hs.contains(cur)) {
                    cur++;
                    len++;
                }
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}
