import java.util.*;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Rishikesh");
        cities.add("Shimla");
        cities.add("goa");
        cities.add("Manali");

        // iterators
        Iterator it = cities.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // advanced for loop
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
