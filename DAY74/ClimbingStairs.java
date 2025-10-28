import java.util.Arrays;

public class ClimbingStairs {
    // fibonacci type question
    public static int countStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countStairs(n - 1) + countStairs(n - 2);
    }

    // memoization code
    public static int countStairs(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countStairs(n - 1, ways) + countStairs(n - 2, ways);
        return ways[n];
    }

    // tabulation code
    public static int tabCountStairs(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(tabCountStairs(n));
    }
}
