import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapB {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>(); // keys are insertion in order

        tm.put("India", 150);
        tm.put("China", 100);
        tm.put("US", 80);
        System.out.println(tm);
    }
}
