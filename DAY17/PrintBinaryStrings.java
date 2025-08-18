package DAY17;

//print all binary strings of size n without consecutive ones

public class PrintBinaryStrings {

    public static void printbinaryt(int n, int lastPlace, String str) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printbinaryt(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printbinaryt(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        printbinaryt(3, 0, "");
    }
}
