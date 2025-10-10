class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int longest = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            st.add(nums[i]);
        }

        for(int num: st) {
            if(!st.contains(num-1)) {
                int cur = num;
                int streak = 1;
                while(st.contains(cur+1)) {
                    cur++;
                    streak++;
                }
                longest = Math.max(streak, longest);
            }
        }
        return longest;
    }
}