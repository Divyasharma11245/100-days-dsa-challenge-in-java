import java.util.*;

// package DAY12;

public class Questions {
    // find the maximum subarray sum for the given target for indexes

    // --brute force--
    public static int maxSubarraySum(int arr[], int target) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - target; i++) {
            int sum = 0;

            for (int j = i; j <= i + target - 1; j++) {
                sum = sum + arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    // --optimized--
    public static int maxSubArraySum(int arr[], int target) {
        int currSum = 0;

        // find sum upto target
        for (int i = 0; i < target; i++) {
            currSum = currSum + arr[i];
        }

        int maxSum = currSum;
        // slide the window
        for (int j = target; j < arr.length; j++) {
            // subtract the first index number of window
            currSum = currSum - arr[j - target];

            // add the next index number of the window
            currSum = currSum + arr[j];

            // compare maxSuma and currSum
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 1, 5, 1, 3, 2 };
        System.out.println(maxSubArraySum(nums, 3));
    }
}
