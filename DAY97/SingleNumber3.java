import java.util.HashMap;
import java.util.Set;

public class SingleNumber3 {
    // approcah 1 ----> using hashmap
    class Solution {
        public int[] singleNumber(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            int arr[] = new int[2];
            int idx = 0;
            Set<Integer> set = map.keySet();
            for (int ele : set) {
                if (map.get(ele) == 1) {
                    arr[idx++] = ele;
                }
            }
            return arr;
        }
    }

    class Solution {
        public int[] singleNumber(int[] nums) {
            int txor = 0;
            for (int i = 0; i < nums.length; i++) {
                txor = nums[i] ^ txor;
            }

            int mask = (txor & txor - 1) ^ txor;

            int res[] = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & mask) == 0) {
                    res[0] ^= nums[i];
                } else {
                    res[1] ^= nums[i];
                }

            }
            return res;
        }
    }
}
