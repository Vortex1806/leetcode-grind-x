class Solution {
    int getMax(int[] arr) {
        int maxi = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi) maxi = arr[i];
        }
        return maxi;
    }

    long requiredHrs(int limit, int[] piles) {
        long reqhrs = 0;
        for(int i = 0; i < piles.length; i++) {
            reqhrs +=(int) Math.ceil((double)piles[i] / limit);
        }
        return reqhrs;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int ans = -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(requiredHrs(mid, piles) <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}