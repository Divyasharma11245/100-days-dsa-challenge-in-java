package DAY88;

public class SearchInSortedAnsRotated {
    class Solution {
        public int search(int[] nums, int target) {
            int si = 0;
            int ei = nums.length - 1;

            if (si > ei) {
                return -1;
            }
            while (si <= ei) {
                int mid = (ei + si) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[si] <= nums[mid]) {
                    // 2 cases
                    if (nums[si] <= target && target <= nums[mid]) {
                        ei = mid - 1;
                    } else {
                        si = mid + 1;
                    }
                } else {
                    // 2 cases
                    if (nums[mid] <= target && target <= nums[ei]) {
                        si = mid + 1;
                    } else {
                        ei = mid - 1;
                    }
                }
            }
            return -1;
        }
    }

}
