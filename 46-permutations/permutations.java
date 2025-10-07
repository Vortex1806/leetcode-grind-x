class Solution {
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void permutations(int[] nums, int ind, List<List<Integer>> ans) {
        if(ind == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < nums.length; i++) {
            swap(i, ind, nums);
            permutations(nums, ind+1, ans);
            swap(i, ind, nums);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        permutations(nums, 0, ans);

        return ans;
    }
}