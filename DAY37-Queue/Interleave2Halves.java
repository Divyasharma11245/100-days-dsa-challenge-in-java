// package DAY37-Queue;

import java.util.*;
import java.util.LinkedList;

public class Interleave2Halves {

    public static void interLeave(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstQueue = new LinkedList<>();

        for (int i = 0; i < size / 2; i++) {
            firstQueue.add(q.remove());
        }

        while (!firstQueue.isEmpty()) {
            q.add(firstQueue.remove());
            q.add(q.remove());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
