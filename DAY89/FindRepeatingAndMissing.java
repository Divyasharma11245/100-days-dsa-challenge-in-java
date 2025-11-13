public class FindRepeatingAndMissing {
    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] repeatedNumber(final int[] A) {
            long n = A.length;
            // S-SN
            // S2-S2N

            long S = (n * (n + 1)) / 2;
            long S2 = (n * (n + 1) * (2 * n + 1)) / 6;

            long SN = 0;
            long S2N = 0;
            for (int i = 0; i < n; i++) {
                SN += (long) A[i];
                S2N += (long) A[i] * (long) A[i];
            }

            long val1 = S - SN;
            long val2 = S2 - S2N;
            val2 = val2 / val1;

            long x = (val1 + val2) / 2;
            long y = x - val1;

            int arr[] = { (int) y, (int) x };

            return arr;

        }
    }

}
