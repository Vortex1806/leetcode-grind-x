class Solution {
    int getMax(int[] arr) {
        int maxi = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxi) maxi = arr[i];
        }
        return maxi;
    }


    int check(int[] bloomDay, int m, int k, int day) {
        int x = k;
        for(int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= day) {
                x--;
                if(x == 0) {
                    m--;
                    x = k;
                    if(m == 0)return m;
                } 
            } else {
                x = k;
            }
        }
        return m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int l = 1;
        int r = getMax(bloomDay);

        while(l <= r) {
            int mid = l + (r - l) /2;
            if(check(bloomDay, m, k, mid) > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if(l > getMax(bloomDay))return -1;
        return l;
    }
}