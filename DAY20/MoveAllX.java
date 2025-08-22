package DAY20;

public class MoveAllX {

    public static void moveAll(String str, int idx, int count, String newString) {

        // base case
        if (idx == str.length()) {
            // add x to new string
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(idx) == 'x') {
            count++;
            moveAll(str, idx + 1, count, newString);
        } else {
            newString += str.charAt(idx);
            moveAll(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAll(str, 0, 0, "");
    }
}
