package DAY16;

public class Recursion2 {

    public static int power(int x, int n) { // O(n) more optimized in Power.java file
        if (n == 0) {
            return 1;
        }
        int xNm1 = power(x, n - 1);
        int xN = x * xNm1;
        return xN;
    }

    public static void main(String args[]) {
        System.out.println(power(2, 10));
        ;
    }
}
