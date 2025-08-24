package DAY23;

public class RatMaze {

    public static void getAns(int maze[][], int row, int col, String path) {
        // base case
        int n = maze.length;
        if (row < 0 || col < 0 || row >= n || col >= n || maze[row][col] == 0) {
            return;
        } else if (row == n - 1 && col == n - 1) {

            System.out.println(path);
            return;
        }

        // recursion call
        maze[row][col] = 0;
        getAns(maze, row + 1, col, path + "D");
        getAns(maze, row - 1, col, path + "U");
        getAns(maze, row, col - 1, path + "L");
        getAns(maze, row, col + 1, path + "R");
        maze[row][col] = 1;

    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        getAns(maze, 0, 0, "");

    }
}
