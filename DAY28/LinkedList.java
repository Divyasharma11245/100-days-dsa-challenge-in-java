
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

        // Step3 - tail = newNode
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

    // SEARCH IN A LINKEDLIST -- ITERATIVE SEARCH--->

    public int itrSearch(int key) {
        Node temp = head;

        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    // --RECURSIVE SEARCH ----->
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // REVERSE A LINKED LIST ---->
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // DELETE THE NTH NODE FROM THE END OF THE LENKED LIST
    public void removeNthEnd(int n) {
        int size = 0; // calculate size
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) { // agar first hi node hua to...
            head = head.next;
            return;
        }

        // last se nth node ko removal
        // first se size-n+1 node ka removal

        int i = 1;
        Node prev = head;
        int idx = size - n;
        while (i < idx) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // <--------Function to check if a linkedlist is palindromne or not -------->
    // FUNCTION TO FIND MIDDLE USING SLOW AND FAST APPROACH
    public Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the middle
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 = find middle using slow and fast approach
        Node middle = middle(head);

        // step2 = reverse the second half of the linked list
        Node prev = null;
        Node curr = middle;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // step 3 = compare the left and right half to be equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    // CHECK IF A CYCLE EXISTS IN A LINKED LIST OR NOT
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn;t exists
    }

    // REMOVE THE CYCLE IN A LINKED LIST IF EXISTS
    public void removeCycle() {

        // detect the cycle
        Node fast = head;
        Node slow = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find the meeting point
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // ab slow == fast hai, matlab cycle ka start mil gaya
        Node ptr = slow;
        while (ptr.next != slow) {
            ptr = ptr.next;
        }
        ptr.next = null; // last node ko null point kara diya

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();

        // ll.addFirst(2);

        // ll.addFirst(1);

        // ll.addLast(2);

        // ll.addLast(1);
        // ll.add(2, 3);
        // ll.add(3, 4);

        // ll.print();
        // System.out.println(ll.palindrome());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.tail.next = ll.head.next;
        System.out.println(isCycle());
        ll.removeCycle();
        System.out.println(isCycle());
        ll.print();
    }
}
