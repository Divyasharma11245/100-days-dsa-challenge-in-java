package DAY85;

import java.util.Arrays;

public class McmMem {

    public static int mcmMem(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0; // single matrix case
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMem(arr, i, k, dp); // A1...Ak ---> arr[i-1]*arr[k]
            int cost2 = mcmMem(arr, k + 1, j, dp); // A(k+1)....Aj ----> arr[k]*arr[i]
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            int finalCost = cost1 + cost2 + cost3;

            ans = Math.min(ans, finalCost);
        }

        return dp[i][j] = ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 3 };
        int n = arr.length;
        int dp[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(mcmMem(arr, 1, arr.length - 1, dp));
    }
}
