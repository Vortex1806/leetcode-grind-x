class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l < r) {
                if(nums[l] + nums[r] + nums[i] == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < nums.length-1 && l > i && nums[l] == nums[l-1])l++; 
                    while(r >= 0 && r < nums.length-1 && nums[r] == nums[r+1])r--; 
                } else if(nums[l] + nums[r] + nums[i] < 0) l++;
                else r--;
            }
        }
        return new ArrayList<>(ans);
    }
}