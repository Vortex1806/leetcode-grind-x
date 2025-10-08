class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<List<Integer>> check = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            List<Integer> a = new ArrayList();
            a.add(nums[i]);
            a.add(i);
            check.add(a);
        }
        check.sort((x, y) -> x.get(0) - y.get(0));
        int i = 0; 
        int j = check.size()-1;

        while(i < j) {
            int a = check.get(i).get(0);
            int b = check.get(j).get(0);
            if(a + b == target)return new int[] {check.get(i).get(1), check.get(j).get(1)};
            else if(a + b < target) i++;
            else j--;
        }
        return new int[] {-1, -1};
    }
}