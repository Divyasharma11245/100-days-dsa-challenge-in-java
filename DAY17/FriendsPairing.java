public class FriendsPairing {

    public static int friendspairing(int n) {

        // base case
        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fNm1 = friendspairing(n - 1);

        // pairs
        int fNm2 = friendspairing(n - 2);
        int pairs = (n - 1) * fNm2;

        // total number of ways are single + pairs
        int totalWays = fNm1 + pairs;

        return totalWays;
    }

    public static void main(String args[]) {
        System.out.println(friendspairing(4));
    }
}
