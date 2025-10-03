import java.util.*;

public class SlidingWindowMax {

    static class Pair implements Comparable<Pair> {
        int value;
        int idx;

        public Pair(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // ascending
            // return this.value-p2.value;

            // descending
            return p2.value - this.value;
        }
    }

    public static void main(String[] args) { // O(nlogk)
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3; // size of window
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // ist window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().value;
        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().value;
        }

        // print
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
