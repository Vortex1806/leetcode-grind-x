class Solution {
    int getMaxFromCol(int[][] matrix, int col) {
        int row = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] > matrix[row][col]) row = i;
        }
        return row;
    }

    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = getMaxFromCol(matrix, mid);

            if (mid - 1 >= 0 && matrix[row][mid-1] > matrix[row][mid]) {
                high = mid - 1;
            } else if (mid + 1 < m && matrix[row][mid+1] > matrix[row][mid]) {
                low = mid + 1;
            } else {
                return new int[] {row, mid};
            }
        }
        return new int[] {-1, -1};
    }
}
