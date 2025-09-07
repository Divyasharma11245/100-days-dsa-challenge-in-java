
// package DAY37-Queue;
import java.util.*;

public class DequeB {

    public static void main(String args[]) {
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(1);
        q.addFirst(2);
        q.addLast(3);
        q.addLast(4);
        // q.removeFirst();
        // q.removeLast();
        System.out.println(q.getFirst());
        System.out.println(q.getLast());

        System.out.print(q);

    }

}
