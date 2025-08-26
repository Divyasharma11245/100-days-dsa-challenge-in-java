package DAY25;

import java.util.ArrayList;

public class PairSum1Optimized { // time complexity O(n) ---TWO POINTERS APPROACH----
    public static boolean isPair(ArrayList<Integer> list, int target) {
        int n = list.size();
        int lp = 0;
        int rp = n - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }

            if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        System.out.println(isPair(list, target));
    }

}
