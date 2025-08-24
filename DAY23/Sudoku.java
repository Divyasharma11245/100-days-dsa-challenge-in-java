package DAY23;

public class Sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column ke liye check
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // row ke liye check
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid k liye check
        int sR = (row / 3) * 3;
        int sC = (col / 3) * 3;

        // traverse in 2d matrix
        for (int i = sR; i < sR + 3; i++) {
            for (int j = sC; j < sC + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col + 1; // default case
        if (col + 1 == 9) { // agar last cell me pahunch gye
            nextRow = row + 1; // row me 1 add hoke next row pe [pahunch jayenge]
            nextCol = 0; // column shuru se start hoyega
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol); // agar cell me alredy koi element exist krrta hai to next
                                                           // cell ke liye call
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) { // agar is safe true return krega tabhi digit cell me place hoyegi
                sudoku[row][col] = digit; // digit place ho chukii hai
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // next cell ke loye call ayegi aur solution exist krta
                                                              // hai to true
                    return true;
                }
                sudoku[row][col] = 0; // agar sudokulovser ne false return kiys to again 0 place krrdenge
                                      // --BACKTRACKING--
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution doesn't exists");
        }
    }
}
