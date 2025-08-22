package DAY20;

public class OccuranceOfElement {

    // static variables
    public static int first = -1;
    public static int last = -1;

    // function
    public static void occurance(String str, int idx, char element) {

        // base case
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(idx) == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        occurance(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "abaacdaefaah";
        occurance(str, 0, 'a');
    }
}
