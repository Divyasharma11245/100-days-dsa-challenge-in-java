public class SentenceToMobile {
    // User function Template for Java
    class Solution {
        String printSequence(String S) {
            String arr[] = { "2", "22", "222",
                    "3", "33", "333",
                    "4", "44", "444", "5", "55", "555", "6", "66", "666",
                    "7", "77", "777", "7777", "8", "88", "888", "9",
                    "99", "999", "9999"
            };

            int n = S.length();
            String ans = "";

            for (int i = 0; i < n; i++) {
                if (S.charAt(i) == ' ') {
                    ans += "0";
                } else {
                    int index = S.charAt(i) - 'A';
                    ans += arr[index];
                }
            }
            return ans;

        }
    }
}
