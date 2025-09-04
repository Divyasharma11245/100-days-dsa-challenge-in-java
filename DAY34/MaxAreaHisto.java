package DAY34;

import java.util.*;

public class MaxAreaHisto {

    public static void maxArea(int height[]) {
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        // next smaller right
        Stack<Integer> s = new Stack<>();

        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // area
        // currArea = height*width
        // width = nsr[i] - nsl[i]-1; height = height[i]
        for (int i = 0; i < height.length; i++) {
            int currH = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = currH * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("max area in histogram is" + maxArea);
    }

    public static void main(String args[]) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(height);
    }
}
