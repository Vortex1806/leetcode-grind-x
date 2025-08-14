class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
               int n1 = num1.length, n2 = num2.length;
        int total = n1 + n2;
        int ind1 = (total / 2) - 1;
        int ind2 = total / 2;
        
        int i = 0, j = 0, cnt = 0;
        int el1 = 0, el2 = 0;

        while (i < n1 && j < n2) {
            int val;
            if (num1[i] < num2[j]) {
                val = num1[i++];
            } else {
                val = num2[j++];
            }
            if (cnt == ind1) el1 = val;
            if (cnt == ind2) el2 = val;
            cnt++;
        }

        while (i < n1) {
            int val = num1[i++];
            if (cnt == ind1) el1 = val;
            if (cnt == ind2) el2 = val;
            cnt++;
        }

        while (j < n2) {
            int val = num2[j++];
            if (cnt == ind1) el1 = val;
            if (cnt == ind2) el2 = val;
            cnt++;
        }

        if (total % 2 == 0) {
            return (el1 + el2) / 2.0;
        }
        return el2;
    }    
}