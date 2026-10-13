class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] numsq = new int[n];
        for(int i = 0; i < n; i++) {
            numsq[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsq);
        long total = 0;
        for(int i = 0; i < n/2; i++) { 
            total -= numsq[i];
        }

        for(int i = n/2; i < n; i++){
            total += numsq[i];
        }
        return total;
    }
}