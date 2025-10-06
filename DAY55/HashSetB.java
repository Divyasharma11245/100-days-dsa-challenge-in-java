import java.util.*;

public class HashSetB {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(null);

        System.out.println(set);
        set.remove(3);
        if (set.contains(3)) {
            System.out.println("Set contains 3");
        }
        System.out.println(set.size());
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
