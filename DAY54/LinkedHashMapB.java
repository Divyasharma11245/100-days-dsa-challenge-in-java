import java.util.*;

public class LinkedHashMapB {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); // keys are insertion in order

        lhm.put("India", 150);
        lhm.put("China", 100);
        lhm.put("US", 80);
        System.out.println(lhm);
    }
}
