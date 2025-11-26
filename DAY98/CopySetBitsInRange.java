public class CopySetBitsInRange {
    // User function Template for Java

    class Solution {
        static int setSetBit(int x, int y, int l, int r) {

            int mask = ((1 << (r - l + 1)) - 1) << (l - 1);

            int first = y & mask;

            int ans = x | first;
            return ans;
        }
    }
}
