class Solution {
    public void sub2(int[] nums, int ind, List<Integer> subList, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(subList));
        for(int i = ind; i < nums.length; i++) {
            if(i > ind && nums[i] == nums[i-1])continue;
            subList.add(nums[i]);
            sub2(nums, i+1, subList, ans);
            subList.remove(subList.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        sub2(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}