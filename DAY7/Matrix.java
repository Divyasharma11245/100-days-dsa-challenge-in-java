import java.util.*;

public class Matrix {

    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at : " + i + "," + j);
                    return true;
                }
            }

        }
        return false;
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i]);
            }
            // right
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(matrix[j][endCol]);
            }
            // bottom;
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i]);
            }
            // left
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[j][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // for (int i = 0; i < matrix.length; i++) { //=====brute force=====
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if ((i + j) == (matrix.length - 1)) {
        // sum += matrix[i][j];
        // }
        // }

        // }

        for (int i = 0; i < matrix.length; i++) { // ====optimizes solution====
            sum += matrix[i][i];

            // j = n-1-i
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        // Scanner sc = new Scanner(System.in);

        // input
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = sc.nextInt();
        // }
        // }

        // output
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        System.out.println(diagonalSum(matrix));
    }
}
