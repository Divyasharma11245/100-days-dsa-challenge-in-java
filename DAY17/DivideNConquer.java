package DAY17;

//merge sort using didvide and conquer
public class DivideNConquer {

    // PRINT ARRAY FUNCTION---->
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // MERGE SORT FUNCTION----->
    public static void mergeSort(int arr[], int si, int ei) {
        // BASE CASE
        if (si >= ei) {
            return;
        }

        // KAAM
        int mid = si + (ei - si) / 2; // (si+ei)/2 bhi use krr skte hai
        mergeSort(arr, si, mid); // recursive function for left part
        mergeSort(arr, mid + 1, ei); // recursive function for right part

        // MERGE FUNCTION CALL
        merge(arr, si, mid, ei);

    }

    // MERGE FUNCTION ------>
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // temporary array
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temporarry array

        // fill in temporary array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) { // cpndition check for all the elements
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // bache hue elements ke liye in left part and right part me alag alag loop
        // lgega
        while (i <= mid) { // left poart k liye
            temp[k++] = arr[i++];
        }

        while (j <= ei) { // right part k liye
            temp[k++] = arr[j++];
        }

        // copy elements to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
