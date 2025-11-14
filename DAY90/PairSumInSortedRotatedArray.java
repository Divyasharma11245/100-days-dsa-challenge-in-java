public class PairSumInSortedRotatedArray {

    class Solution {
        static boolean pairInSortedRotated(int arr[], int target) {
            int n = arr.length;

            int i;
            for (i = 0; i < n - 1; i++)
                if (arr[i] > arr[i + 1])
                    break;

            int lp = (i + 1) % n;
            int rp = i;

            while (lp != rp) {

                if (arr[lp] + arr[rp] == target)
                    return true;

                if (arr[lp] + arr[rp] < target)
                    lp = (lp + 1) % n;

                else
                    rp = (rp - 1 + n) % n;
            }
            return false;
        }
    }

}
