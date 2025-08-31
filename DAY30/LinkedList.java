package DAY30;

public class LinkedList {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode o = head;
            ListNode e = head.next;
            ListNode evenH = e;
            while (e != null && e.next != null) {
                o.next = e.next;
                o = o.next;
                e.next = e.next.next;
                e = o.next;
            }
            o.next = evenH;
            return head;
        }
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        ListNode a = curr;
        ListNode b = head;
        while (curr != null && curr.next != null) {
            curr = curr.next;
            b = b.next;
        }

        int temp = a.val;
        a.val = b.val;
        b.val = temp;
        return head;
    }

    public int getLinkedListSize(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1 = getLinkedListSize(headA);
        int size2 = getLinkedListSize(headB);

        while (size1 > size2) {
            size1--;
            headA = headA.next;
        }

        while (size1 < size2) {
            size2--;
            headB = headB.next;
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

}
