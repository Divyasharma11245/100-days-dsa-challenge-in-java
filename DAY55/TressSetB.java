import java.util.*;

public class TressSetB {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Rishikesh");
        cities.add("Shimla");
        cities.add("goa");
        cities.add("Manali");

        System.out.println(cities);
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Delhi");
        set.add("Rishikesh");
        set.add("Shimla");
        set.add("goa");
        set.add("Manali");

        System.out.println(set);

        TreeSet<String> ts = new TreeSet<>(); // O(logn) -> due to sorting

        ts.add("Delhi");
        ts.add("Rishikesh");
        ts.add("Shimla");
        ts.add("goa");
        ts.add("Manali");

        System.out.println(ts);

        // same functions as hashset
    }
}
