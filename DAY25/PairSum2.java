// package DAY25;

import java.util.*;

//for sorted and rotated arrayList  ---Optimized solution---
//modular approach
//lp = (lp+1)%n
//rp = (n+rp-1)%n

public class PairSum2 { // time complexity - O(n) --- TWO POINTERS APPROACH---

    public static boolean isPair2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // cases likhungiii
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }

            // case 3
            if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }

        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(isPair2(list, target));
    }

}
