import java.util.HashMap;

public class removeDuplicates {
    // User function Template for Java

    class Solution {
        public String removeConsecutiveCharacter(String s) {
            HashMap<Character> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (!map.contains(s.charAt())) {
                    map.put(s.chaAt(i));
                }
            }
            String ans = map.toString();

            return ans;
        }
    }
}
