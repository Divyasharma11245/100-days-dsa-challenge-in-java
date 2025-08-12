public class BitManipulation2 {
    public static boolean isPower2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = (n >> 1);
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(fastExpo(3, 5));
        ;
    }
}
