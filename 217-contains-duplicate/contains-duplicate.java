class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> checked = new HashSet<>();

        for(int num: nums) {
            if(checked.contains(num))return true;
            checked.add(num);
        }
        return false;
    }
}