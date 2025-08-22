// package DAY21-backtracking;

public class Permutation {

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion-kaam
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // revoval of the current character from the originbal string
            // we will use substring method here like thiss
            // "abcde" = "ab" +"de" = "abde"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        permutation(str, "");
    }
}
