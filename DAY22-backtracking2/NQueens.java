public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // public static void nQueens(char board[][], int row) {
    // // base case
    // if (row == board.length) {
    // printBoard(board);
    // count++;
    // return;
    // }

    // for (int j = 0; j < board.length; j++) {
    // if (isSafe(board, row, j)) {
    // board[row][j] = 'Q';
    // nQueens(board, row + 1); // recursion call
    // board[row][j] = '.'; // backtracking step
    // }
    // ;
    // }
    // }

    // to chrck if solution exists and print 1 solution

    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = '.'; // backtracking step
            }

        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------chess board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];

        // initialize the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // nQueens(board, 0);
        if (nQueens(board, 0)) {
            System.out.println("solution is possible");
            nQueens(board, 0);
        } else {
            System.out.println("solution is not possible");
        }

        // System.out.println("total ways to vount n-queens = " + count);
    }
}
