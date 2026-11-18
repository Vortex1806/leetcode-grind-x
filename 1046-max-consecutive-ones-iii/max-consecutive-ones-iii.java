class Solution {
    public int longestOnes(int[] nums, int k) {
        int freqz = 0;
        int maxlen = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) freqz++;
            while(freqz > k) {
                if(nums[left] == 0) {
                    freqz--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}