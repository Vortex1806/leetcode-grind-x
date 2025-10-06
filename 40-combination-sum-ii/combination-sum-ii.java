class Solution {
    public void findSubset(int[] candidates, int ind, int target, List<Integer> val, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(val));
            return;
        }

        for (int i = ind; i < candidates.length; i++) {
            if (i > ind && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;
            val.add(candidates[i]);
            findSubset(candidates, i + 1, target - candidates[i], val, ans);
            val.remove(val.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        findSubset(candidates, 0, target, new ArrayList<>(), ans);
        
        return ans;
    }
}