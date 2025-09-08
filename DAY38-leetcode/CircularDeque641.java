package DAY38-leetcode;

public class CircularDeque641 {
    class MyCircularDeque {

        int arr[];
        int front;
        int rear;
        int length;

        public MyCircularDeque(int k) {
            arr = new int[k];
            front = 0;
            rear = 0;
            length = 0;
        }

        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            }

            front = (front - 1 + arr.length) % arr.length;
            arr[front] = value;
            length++;
            return true;
        }

        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            }

            arr[rear] = value;
            rear = (rear + 1) % arr.length;
            length++;
            return true;
        }

        public boolean deleteFront() {
            if (isEmpty()) {
                return false;
            }
            front = (front + 1) % arr.length;
            length--;
            return true;
        }

        public boolean deleteLast() {
            if (isEmpty()) {
                return -1;
            }

            rear = (rear - 1 + arr.length) % arr.length;
            length--;
            return true;
        }

        public int getFront() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }

        public int getRear() {
            if (isEmpty()) {
                return -1;
            }
            int prevIdx = (rear - 1 + arr.length) % arr.length;
            return arr[prevIdx];
        }

        public boolean isEmpty() {
            if (length == 0) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            if (length == arr.length) {
                return true;
            }
            return false;
        }
    }

    /**
     * Your MyCircularDeque object will be instantiated and called as such:
     * MyCircularDeque obj = new MyCircularDeque(k);
     * boolean param_1 = obj.insertFront(value);
     * boolean param_2 = obj.insertLast(value);
     * boolean param_3 = obj.deleteFront();
     * boolean param_4 = obj.deleteLast();
     * int param_5 = obj.getFront();
     * int param_6 = obj.getRear();
     * boolean param_7 = obj.isEmpty();
     * boolean param_8 = obj.isFull();
     */
}
