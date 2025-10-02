class Solution {
    public void sub(int[] nums, int ind, List<Integer> subList, List<List<Integer>> newList) {
        if(ind >= nums.length) {
            newList.add(subList);
            return;
        }
        subList.add(nums[ind]);
        sub(nums, ind+1, new ArrayList<>(subList), newList);
        subList.remove(new Integer(nums[ind]));
        sub(nums, ind+1, new ArrayList<>(subList), newList);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        sub(nums, 0, new ArrayList<>(), ansList);
        return ansList;
    }
}