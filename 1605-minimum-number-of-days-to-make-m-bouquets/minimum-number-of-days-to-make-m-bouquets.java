class Solution {
    public boolean canBuild(int[] bloomDay, int m, int k, int date) {
        int boquet = 0;
        int totalBoquet = 0;

        for(int day: bloomDay) {
            if(day <= date) {
                boquet++;
                if(boquet == k) {
                    totalBoquet++;
                    boquet = 0;
                }
            } else {
                boquet = 0;
            }
        }
        return totalBoquet >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(k > bloomDay.length/m) return -1;
        int least = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int day: bloomDay) {
            if(day < least) least = day;
            if(day > maxi) maxi = day;
        }

        int low = least;
        int high = maxi;
        while(low < high) {
            int mid = low + (high-low) /2;
            if(canBuild(bloomDay, m, k, mid))high = mid;
            else low = mid + 1;
        }
        return low > maxi ? -1 : low;
    }
}