class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int[] a = nums.clone();
        Arrays.sort(a);
        for(int i = 0; i < n; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;
            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = a[i] + a[left] + a[right];
                if(sum == 0) {
                    result.add(Arrays.asList(a[i], a[left], a[right]));
                    left++;
                    right--;
                    while(left < right  && a[left] == a[left-1]) left++;
                    while(left < right  && a[right] == a[right+1]) right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return result;
    }
}