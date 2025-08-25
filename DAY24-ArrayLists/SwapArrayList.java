
// package DAY24-ArrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

    public static void swap(ArrayList<Integer> list) {
        int idx1 = 1;
        int idx2 = 3;
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // swap(list);
        Collections.sort(list);
        System.out.println(list); // IN ASCENDING ORDER

        Collections.sort(list, Collections.reverseOrder()); // IN DESCENDING ORDER ----2nd parameters are comparartors
                                                            // which are used to define the function logic
        System.out.println(list);
    }

}
