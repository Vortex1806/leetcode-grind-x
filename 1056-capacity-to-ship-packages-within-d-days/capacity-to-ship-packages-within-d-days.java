class Solution {
    public boolean canShip(int[] weights, int capacity, int days) {
        int daysRequired = 1;
        int load = 0;
        for(int w : weights) {
            if(load + w > capacity) {
                daysRequired++;
                if(daysRequired > days) {
                    return false;
                }
                load = 0;
            }
            load += w;
        }
        return daysRequired <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int largest = 0;
        int total = 0;
        for(int x: weights) {
            if(x > largest) largest = x;
            total += x;
        }

        int low = largest;
        int high = total;
        while(low < high) {
            int mid = low + (high-low)/2;
            if(canShip(weights, mid, days)) high= mid;
            else low = mid +1;
        }
        return low;
    }
}