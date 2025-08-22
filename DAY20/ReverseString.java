package DAY20;

public class ReverseString {

    public static void reverse(String str, int idx) {
        // base case
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        // kaam
        System.out.println(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static void main(String args[]) {
        String str = "Anand";
        reverse(str, str.length() - 1);
    }
}
