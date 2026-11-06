class Solution {
    public int findFirst(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] >= target) high = mid - 1;
            else low = mid +1;
        }
        if(low < n && nums[low] == target) {
            return low;
        }
        return -1;
    }   

    public int findLast(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] > target) high = mid - 1;
            else low = mid +1;
        }
        if(high < n && nums[high] == target) {
            return high;
        }
        return -1;
    }   
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)return new int[] {-1,-1};
        int first = findFirst(nums, target);
        if(first == -1)return new int[] {-1,-1};
        int last = findLast(nums,target);
        return new int[] {first, last};
    }
}