class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        map<int, int> presum;
        int n = nums.size();
        presum[0] = 1;
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum-k;
            if(presum.find(rem) != presum.end()) {
                cnt += presum[rem];
            }
            if(presum.find(sum)==presum.end()) presum[sum]=1;
            else presum[sum]++;
        }
        return cnt;
    }
};