import java.util.HashMap;
import java.util.Set;

public class SingleNumber2 {
    class Solution {
        public int singleNumber(int[] nums) {
            // approach 1 - using map
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            Set<Integer> set = map.keySet();

            for (int ele : set) {
                if (map.get(ele) == 1) {
                    return ele;
                }
            }
            return -1;
        }
    }

    // approcah 2
    class Solution {
        public int singleNumber(int[] nums) {
            // approach 2 - using bits and counting the number of set bits
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] & (1 << i)) != 0) {
                        count++;
                    }
                }
                if (count % 3 == 1) {
                    ans = ans | (1 << i);
                }
            }
            return ans;
        }
    }

    // approach 3 - simple maths
    class Solution {
        public int singleNumber(int[] nums) {
            // approach 3 - using simple maths
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i = i + 3) {
                if (nums[i] != nums[i - 1]) {
                    return nums[i - 1];
                }
            }
            return nums[nums.length - 1];
        }
    }
}
