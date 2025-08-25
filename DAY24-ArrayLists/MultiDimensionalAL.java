// package DAY24-ArrayLists;

import java.util.*;

public class MultiDimensionalAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // list1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        // list2
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        // list3
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);

        // add in main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

    }

}
