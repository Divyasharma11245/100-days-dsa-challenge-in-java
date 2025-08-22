public class Arrays {
    public static void changeArr(int arr[], int idx, int value) {
        // base case
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[idx] = value;
        changeArr(arr, idx + 1, value + 1); // function call
        arr[idx] = arr[idx] - 2; // backtracking
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        System.out.println();
        printArr(arr);
    }
}
