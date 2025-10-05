import java.util.*;

public class HashMapB {
    public static void main(String[] args) {

        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // put -O(1)
        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Bhutan", 90);

        System.out.println(hm);

        // get -O(1)

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Nepal")); // null value

        // containsKey -O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // remove -O(1)
        System.out.println(hm.remove("India")); // value return krke dedega

        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // is Empty
        System.out.println(hm.isEmpty());

        // clear function --> clear all the data inside the hashmap
        hm.clear();
        System.out.println(hm.isEmpty());

    }

}
