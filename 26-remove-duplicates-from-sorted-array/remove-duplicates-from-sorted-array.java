class Solution {
    public int removeDuplicates(int[] nums) {
        int write = 0;
        for(int read = 1; read < nums.length; read++) {
            if(nums[read] != nums[write]) {
                nums[write+1] = nums[read];
                write++;
            }
        }
        return write+1;
    }
}