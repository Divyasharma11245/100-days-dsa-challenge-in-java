package DAY16;

public class TilingProblem {

    public static int tiles(int n) {// n == width of the floor

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fNm1 = tiles(n - 1);

        // horizontal choice
        int fNm2 = tiles(n - 2);

        int totalWays = fNm1 + fNm2;

        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(tiles(4));
        ;
    }
}
