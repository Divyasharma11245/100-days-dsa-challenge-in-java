package DAY4;

import java.util.*;

public class TrappedWater {
    public static int trappedWater(int height[]) {

        int n = height.length;

        // calculate maximum left boundary
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        // calculate maximum right boundary
        int maxRight[] = new int[n];
        maxRight[n - 1] = height[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {

            // calculate water level
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);

            // calculate trapped water
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedWater(height));
    }
}
