import java.util.*;

public class StringsQues {

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if (result) {
                System.out.println("strings are anagram");
            } else {
                System.out.println("strings are not anagram!");
            }
        } else {
            System.out.println("strings are not anagram!");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // System.out.println(countVowels(str));

        String str = "ShradhaDidi";
        String str1 = "apnaCollege".replace("l", " ");
        String str2 = "ShradhaDidi";
        anagram("hello", "lloh");
    }
}
