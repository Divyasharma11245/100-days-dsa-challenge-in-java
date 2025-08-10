import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // check if a string is palindrome or not
    public static Boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // find shortest path
    public static float getDisplacement(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else {
                System.out.println("invalid direction!");
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    // print substring function
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    // find largest lexicographically
    public static String largest(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {

        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("abcd");

        // strings are immutable

        // input of strings
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        // String firstName = "Shradha";
        // String lastName = "Khapra";
        // String fullName = firstName + " " + lastName;

        // String str = "Divya Sharma";
        // System.out.println(subString(str, 1, 9));

        String fruits[] = { "apple", "mango", "banana", "lichi" };
        System.out.println(largest(fruits));
    }
}
