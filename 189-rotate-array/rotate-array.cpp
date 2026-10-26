class Solution {
public:
    // void reverse(vector<int>& nums, int l, int r) {
    //     while(l < r) {
    //         swap(nums[l], nums[r]);
    //         l++;
    //         r--;
    //     }
    // } 

    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k = k % n;
        reverse(nums.begin(), nums.begin() + n-k);
        reverse(nums.begin()+n-k, nums.end());
        reverse(nums.begin(), nums.end());
    }
};