package DAY85;

public class McmTab {

    public static int mcmTab(int arr[]) {
        int n = arr.length;

        // table
        int dp[][] = new int[n][n];

        // initialization
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // bottom upp filling
        for (int len = 2; len <= n - 1; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {

                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];

                    int finalCost = cost1 + cost2 + cost3;

                    dp[i][j] = Math.min(dp[i][j], finalCost);

                }
            }
        }
        print(dp);
        return dp[1][n - 1];
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        System.out.println(mcmTab(arr));

    }
}
