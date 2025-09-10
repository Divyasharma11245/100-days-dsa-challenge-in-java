import java.util.*;

public class MinAbsolute {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbs = 0;
        for (int i = 0; i < A.length; i++) {
            minAbs += Math.abs(A[i] - B[i]);
        }

        System.out.println("minimum absolute is : " + minAbs);
    }
}
