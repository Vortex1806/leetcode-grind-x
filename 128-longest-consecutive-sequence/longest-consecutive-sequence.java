class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        int maxCnt = 1;
        int cnt = 1;
        for(int val: hs) {
            if(hs.contains(val-1)) {
                continue;
            } else {
                int temp = val;
                while(hs.contains(temp+1)) {
                    temp++;
                    cnt++;
                }
                maxCnt = Math.max(cnt, maxCnt);
                cnt = 1;
            }
        }
        
        return maxCnt;
    }
}