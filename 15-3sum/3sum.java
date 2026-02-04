class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = -1 * nums[i];
            HashSet<Integer> st = new HashSet<>();
            for(int j = i+1; j < nums.length; j++) {
                int rem = target - nums[j];
                if(st.contains(rem)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], rem);
                    ans.add(triplet);
                } else {
                    st.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}