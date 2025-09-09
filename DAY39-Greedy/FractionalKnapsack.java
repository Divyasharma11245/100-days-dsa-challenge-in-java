import java.util.*;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        // sorting in ascending
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // ascending sorted

        int capacity = W;
        int finalVal = 0;
        for (int j = ratio.length - 1; j >= 0; j--) {
            int idx = (int) ratio[j][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += (ratio[j][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalVal);
    }
}