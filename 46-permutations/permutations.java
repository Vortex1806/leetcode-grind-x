class Solution {
    public void permutations(int[] nums, boolean[] freq, List<Integer> ds, List<List<Integer>> ans) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permutations(nums, freq, ds, ans);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        permutations(nums, new boolean[nums.length], new ArrayList<>(), ans);

        return ans;
    }
}