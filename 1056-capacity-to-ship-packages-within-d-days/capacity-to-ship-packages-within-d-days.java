class Solution {
    int getTotal(int[] arr) {
        int total = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    int check(int[] weights, int cap) {
        int totalTillNow = 0;
        int days = 0;
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] > cap) return Integer.MAX_VALUE;
            if(totalTillNow + weights[i] > cap) {
                days++;
                totalTillNow = weights[i];
            } else {
                totalTillNow += weights[i];
            }
        }
        days++;
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = getTotal(weights);

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(check(weights, mid) > days) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}