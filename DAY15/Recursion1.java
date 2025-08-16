public class Recursion1 {
    public static void printDec(int n) {

        if (n == 1) {
            System.out.println("1");
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factNm1 = factorial(n - 1);
        long fact = n * factNm1;
        return fact;
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sNm1 = calcSum(n - 1);
        int sN = n + sNm1;
        return sN;
    }

    public static int printFib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fibNm1 = printFib(n - 1);
        int fibNm2 = printFib(n - 2);

        int fibN = fibNm1 + fibNm2;

        return fibN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
