class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int i = 0, j=0, k=0;
        double ind1 =0, ind2=0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) {
                if(k == ((n/2)-1)) ind1 = nums1[i];
                else if(k == (n/2)) {ind2 = nums1[i];  }
                i++;
            } else {
                if(k == ((n/2)-1)) ind1 = nums2[j];
                if(k == (n/2)) {ind2 = nums2[j];}
                j++;
            }
            k++;
        }
        while(i < n1) {
            if(k == ((n/2)-1)) ind1 = nums1[i];
                else if(k == (n/2)) {ind2 = nums1[i]; }
                i++;
                k++;
        }
        while(j < n2) {
            if(k == ((n/2)-1)) ind1 = nums2[j];
                if(k == (n/2)) {ind2 = nums2[j]; }
                j++;
                k++;
        }
        if(n%2 == 0) return (double)((ind1 + ind2) / 2);
        return (double) (ind2);
    }
}