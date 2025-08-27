// package DAY26-linkedList;

public class LinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD IN A LINKED LIST

    // add first
    public void addFirst(int data) {
        // STEP1 - create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) { // agar linked list me ek bhi node nhi hogii to
            head = tail = newNode;
            return;

        }

        // STEP2 - new node ka next = head
        newNode.next = head;

        // Step3 - head = new node
        head = newNode;
    }

    // add last
    public void addLast(int data) {
        // STEP1 - create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) { // agar linkedlist khaali hui
            head = tail = newNode;
        }

        // STEP2 - tail ka next = newNode
        tail.next = newNode;

        // Steo3 - tail = newNode
        tail = newNode;
    }

    // PRINT A LINKED LIST
    public void print() {
        if (head == null) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // ADD IN THE MIDDLE OF A LINKED LIST
    public void add(int idx, int data) {

        if (idx == 0) {
            addFirst(data); // head ki value change horii hai idliye head ko bhi handle krrna jruri hai
            return;
        }
        Node newNode = new Node(data); // create the new node
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 => temp = prev;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // REVOVE IN A LINKEDLIST

    // revove first
    public int removeFirst() {
        if (size == 0) { // when linked list is already empty
            System.out.println("Linked List is already empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // when linked list me sirf ek hi node hai
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast() {
        if (size == 0) { // when linked list is already empty
            System.out.println("Linked List is already empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // when linked list me sirf ek hi node hai
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev = size-2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        // aab previous prr khde hai
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(3);

        ll.addLast(4);
        ll.add(2, 9);

        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.removeLast();

        ll.print();
        System.out.println(ll.size);
    }
}
