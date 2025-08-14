class Solution {
    public int accomodates(int[] arr, int maxPages) {
        int studentPages = arr[0];
        int studentCnt = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] + studentPages > maxPages) {
                studentCnt++;
                studentPages = arr[i];
            } else {
                studentPages += arr[i];
            }
        }
        return studentCnt;
    }

    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return - 1;
        int low = max(nums);
        int high = total(nums);
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(accomodates(nums, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    int max(int[] arr) {
        int maxi = arr[0];
        for(int val : arr) {
            if(val > maxi) {
                maxi = val;
            }
        }
        return maxi;
    }

    int total(int[] arr) {
        int tot = 0;
        for(int val : arr) {
            tot += val;
        }
        return tot;
    }
    
}




