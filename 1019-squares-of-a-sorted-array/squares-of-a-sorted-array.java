class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sq = new int[nums.length];
        int left = 0; 
        int right = n-1;
        for(int pos = n-1; pos >= 0; pos--) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if(leftsq > rightsq) {
                sq[pos] = leftsq;
                left++;
            } else {
                sq[pos] = rightsq;
                right--;
            }
        }
        return sq;
    }
}