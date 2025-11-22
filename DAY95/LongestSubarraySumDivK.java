public class LongestSubarraySumDivK {
    // User function Template for Java

    class Solution {
        int longestSubarrayDivK(int[] arr, int k) {
            if (k == 0)
                return 0;
            int ans = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            long sum = 0;
            long Lrem = 0;
            map.put(0, -1);
            for (int i = 0; i < arr.length; i++) {
                sum += (long) arr[i];
                Lrem = sum % (long) k;

                if (Lrem < 0) {
                    Lrem += k;
                }
                int rem = (int) Lrem;
                if (map.containsKey(rem)) {
                    int idx = map.get(rem);
                    int len = i - idx;
                    if (len > ans) {
                        ans = len;
                    }
                } else {
                    map.put(rem, i);
                }
            }
            return ans;
        }
    }

}
