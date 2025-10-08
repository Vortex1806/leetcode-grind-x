class Solution {
    private boolean isSafe(int n, int col, int row, char[][] board) {
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    public void placeQueens(int n, int col, char[][] board, List<List<String>> ans) {
        if(col == n) {
            List<String> finalboard = new ArrayList<>();
            for(int i =0; i < n; i++) {
                finalboard.add(new String(board[i]));
            }
            ans.add(finalboard);
            return;
        }

        for(int row = 0; row < n; row++) {
            if(isSafe(n, col, row, board)) {
                board[row][col] = 'Q';
                placeQueens(n, col + 1, board, ans);
                board[row][col] = '.';
            }   
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        placeQueens(n, 0, board, ans);

        return ans;
    }
}