import java.util.*;

public class IterateHM {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 150);
        hm.put("China", 100);
        hm.put("Indonesia", 90);
        hm.put("Nepal", 80);
        hm.put("Bhutan", 45);

        System.out.println(hm);

        Set<String> keys = hm.keySet();

        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}
