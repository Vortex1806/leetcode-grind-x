class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int a[] = nums.clone();
        Arrays.sort(a);
        int n = nums.length;
        int best = a[0] + a[1] + a[2];
        for(int i = 0; i < n-2; i++) {
            int l = i+1;
            int r = n-1;
            while(l < r) {
                int sum = a[i] + a[l] + a[r];
                if(Math.abs(sum - target) < Math.abs(best-target)) {
                    best = sum;
                }
                if(sum == target)return sum;
                else if(sum < target) l++;
                else r--;
            }
        }
        return best;
    }
}