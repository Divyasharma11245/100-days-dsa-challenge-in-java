package DAY91;

import java.util.ArrayList;

public class IndesxesOfSubarraySum {
    class Solution {
        static ArrayList<Integer> subarraySum(int[] arr, int target) {
            int left = 0, sum = 0;
            ArrayList<Integer> ans = new ArrayList<>();

            for (int right = 0; right < arr.length; right++) {
                sum += arr[right];

                while (sum > target) {
                    sum -= arr[left];
                    left++;
                }

                if (sum == target) {
                    ans.add(left + 1);
                    ans.add(right + 1);
                    return ans;
                }
            }

            ans.add(-1);
            return ans;
        }
    }

}
