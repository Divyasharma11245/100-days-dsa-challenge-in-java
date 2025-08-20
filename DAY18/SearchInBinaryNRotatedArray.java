package DAY18;

public class SearchInBinaryNRotatedArray {

    public static int search(int arr[], int target, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // find mid
        int mid = si + (ei - si) / 2;

        // if found on mid
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) { // mid on L1
            if (arr[si] <= target && target <= arr[mid]) { // case a: left
                return search(arr, target, si, mid - 1);
            } else { // case b: left of L1 and on L2
                return search(arr, target, mid + 1, ei);
            }

        } else { // mid on L2
            if (arr[mid] <= target && target <= arr[ei]) { // on right of L2
                return search(arr, target, mid + 1, ei);
            } else { // on left of L2 and on L1
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 5;
        int targetIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIdx);
    }
}
