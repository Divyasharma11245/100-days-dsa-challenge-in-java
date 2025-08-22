
public class TowerOfHanoi {
    public static void towerOfhanoi(int n, String src, String helper, String dest) {

        // base case
        if (n == 1) {
            System.out.println("transer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // kaam
        towerOfhanoi(n - 1, src, dest, helper);
        System.out.println("transer disk " + n + " from " + src + " to " + dest);
        towerOfhanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        towerOfhanoi(n, "S", "H", "D");

    }
}
