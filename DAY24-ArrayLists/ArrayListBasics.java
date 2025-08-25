import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation - O(1)
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // get operation -O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove operation - O(n)
        list.remove(2);
        System.out.println(list);

        // set operation -O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains operation - O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));

        // size of an arraylist
        System.out.println(list.size());

        // print all elements of AL
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // print reverse of an arraylist
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        // find maximum in arralist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}
