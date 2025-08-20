public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        // kaam
        int pIdx = partition(arr, si, ei); // ye partition function pivot ka index dega hume jo pivot ko uski sahi jagah
                                           // prr rakhega
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    // PARTITION FUNCTION----->
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; // humne yaha pivot ki jagah ei isliye use kiya hai kyunki pivot ek variable hai
                          // aur hume variable ki jagah uss index me changes krrne hai
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5, -5, -8 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
