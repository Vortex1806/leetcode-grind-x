class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 0;
        int i = 1;
        int cnt = 0;
        while(j < arr.length) {
            if(i < arr[j]) {
                cnt++;
                if(cnt == k) return i;
                i++;
            } else if(i == arr[j]) {
                i++;
                j++;
            } else if(i > arr[j]) {
                j++;
            }
        }
        return arr[arr.length-1]+k-cnt;
    }
}