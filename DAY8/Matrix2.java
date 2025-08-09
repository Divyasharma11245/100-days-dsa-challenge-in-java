package DAY8;

public class Matrix2 {

    public static boolean searchSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at index ( " + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static int countNum(int matrix[][], int num) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == num) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findSum(int matrix[][], int row) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i == row) {
                for (int j = 0; j < matrix[0].length; j++) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void transpose(int matrix[][]) {
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // int temp = i;
        // i = j;
        // j = temp;
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        int key = 4;
        transpose(matrix);

    }
}
