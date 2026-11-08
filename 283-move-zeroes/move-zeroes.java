class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int write = 0;
        for(int read = 0; read < nums.length; read++) {
            if(nums[read] != 0) {
                swap(nums, read, write);
                write++;
            }
        }
    }
}