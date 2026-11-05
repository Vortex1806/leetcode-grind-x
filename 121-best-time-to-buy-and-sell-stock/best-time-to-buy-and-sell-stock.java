class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0; 
        int maxsum = 0;
        for(int i = 1; i < prices.length;i++) {
            sum += prices[i] - prices[i-1];
            maxsum = Math.max(maxsum, sum);
            if(sum < 0) sum = 0;
        }
        return maxsum;
    }
}
