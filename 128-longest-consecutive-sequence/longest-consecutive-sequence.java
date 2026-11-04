class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int n = nums.length;
        int a[] = nums.clone();
        Arrays.sort(a);
        int mlen = 1;
        int len = 1;
        for(int i = 1; i < n; i++) {
            if(a[i] == a[i-1] + 1) {
                len++;
            } else if(a[i] == a[i-1]) {
                continue;
            } else {
                len = 1;
            }
            mlen = Math.max(mlen, len);
        }
        return mlen;
    }
}
