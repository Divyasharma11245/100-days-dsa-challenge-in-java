public class PrintInRange {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // CASE 1
        if (root.data <= k2 && root.data >= k1) { // left subtree aur right subtree
            printInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        // CASE 2
        if (root.data < k1) {
            printInRange(root.left, k1, k2);
        }

        if (root.data > k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        printInRange(root, 5, 10);
    }
}
