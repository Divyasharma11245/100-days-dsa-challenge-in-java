// package DAY37-Queue;

import java.util.*;

public class QueueUsingDeque {

    static class Queue {
        Deque<Integer> q = new LinkedList<>();

        public void add(int data) {
            q.addLast(data);
        }

        public int remove() {
            return q.removeLast();
        }

        public int peek() {
            return q.getLast();
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q.remove());
    }

}
