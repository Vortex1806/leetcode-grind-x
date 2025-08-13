class Solution {
    int getMax(int[] arr) {
        int maxi = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi) maxi = arr[i];
        }
        return maxi;
    }

    int check(int[] nums, int x) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            ans += (int) Math.ceil((double) nums[i] / x);
        }
        return ans;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = getMax(nums);

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}