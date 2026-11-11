class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int a[] = nums.clone();
        Arrays.sort(a);
        int n = nums.length;

        for(int i = 0 ; i < n; i++) {
            if(i > 0 && a[i] == a[i-1])continue;
            for(int j = i+1; j < n; j++) {
                if(j > i + 1 && a[j] == a[j-1])continue;
                int left = j+1;
                int right = n-1;
                while(left < right) {
                    long sum = (long) a[i] + a[j] + a[left] + a[right];
                    if(sum == target) {
                        result.add(Arrays.asList(a[i], a[j], a[left], a[right]));
                        left++;
                        right--;
                        while(left < right && a[left] == a[left-1])left++;
                        while(left < right && a[right] == a[right+1])right--;
                    } else if(sum < target) left++;
                    else right--;
                }
            }
        }
        return result;
    }
}