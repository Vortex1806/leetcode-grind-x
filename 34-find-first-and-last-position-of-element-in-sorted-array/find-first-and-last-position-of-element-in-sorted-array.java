class Solution {
    int lowerBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(nums[mid] >= target) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    int upperBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int res = nums.length;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(nums[mid] > target) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) return new int[] {-1, -1};
        int x = lowerBound(nums, target);
        if(x == nums.length || nums[x] != target) return new int[] {-1, -1};
        return new int[] {x, upperBound(nums, target) -1};
    }
}