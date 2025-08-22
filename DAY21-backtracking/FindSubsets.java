// package DAY21-backtracking;

public class FindSubsets {

    public static void subsets(String str, String ans, int idx) {
        // base case
        if (idx == str.length()) {
            if (ans.length() == 0) { // for emplty string
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // recursion
        // choise-yes
        subsets(str, ans + str.charAt(idx), idx + 1);

        // choise-NO
        subsets(str, ans, idx + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
