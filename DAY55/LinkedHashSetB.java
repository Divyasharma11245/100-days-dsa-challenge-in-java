import java.util.*;

public class LinkedHashSetB {
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
        // same functions as hashset

    }
}
