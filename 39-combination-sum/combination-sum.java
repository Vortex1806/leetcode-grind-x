class Solution {
    public void findSum(int[] candidates,int ind, int target, List<Integer> val, List<List<Integer>> ans) {
        if(ind == candidates.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(val));
            }
            return;
        }     
        if(candidates[ind] <= target) {
            val.add(candidates[ind]);
            findSum(candidates, ind, target - candidates[ind], val, ans);
            val.remove(val.size()-1);
        }
        findSum(candidates, ind+1, target, val, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findSum(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
}