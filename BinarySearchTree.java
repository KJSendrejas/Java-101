public class BinarySearchTree {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    static class BST {
        Node root;

        public boolean search(int key) {
            return search(root, key);
        }

        private boolean search(Node node, int key) {
            if (node == null) return false;
            if (node.key == key) return true;
            return (key < node.key) ? search(node.left, key) : search(node.right, key);
        }

        

        public void insert(int key) {
            root = insert(root, key);
        }

        private Node insert(Node node, int key) {
            if (node == null) return new Node(key);

            if (key < node.key) node.left = insert(node.left, key);
            else if (key > node.key) node.right = insert(node.right, key);
            // if equal, do nothing (no duplicates)

            return node;
        }

        public void delete(int key) {
            root = delete(root, key);
        }

        private Node delete(Node node, int key) {
            if (node == null) return null;

            if (key < node.key) {
                node.left = delete(node.left, key);
            } else if (key > node.key) {
                node.right = delete(node.right, key);
            } else {
                
                if (node.left == null && node.right == null) return null;
                if (node.left == null) return node.right;
                if (node.right == null) return node.left;

                int successor = findMin(node.right);
                node.key = successor;
                node.right = delete(node.right, successor);
            }
            return node;
        }

        public int findMin() {
            if (root == null) throw new IllegalStateException("Tree is empty.");
            return findMin(root);
        }

        private int findMin(Node node) {
            while (node.left != null) node = node.left;
            return node.key;
        }

        public int findMax() {
            if (root == null) throw new IllegalStateException("Tree is empty.");
            return findMax(root);
        }

        private int findMax(Node node) {
            while (node.right != null) node = node.right;
            return node.key;
        }

        public void printInorder() {
            System.out.print("Inorder: ");
            inorder(root);
            System.out.println();
        }

        private void inorder(Node node) {
            if (node == null) return;
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }


    public static void main(String[] args) {
        BST bst = new BST();

        int[] values = {50, 15, 60, 10, 20, 65, 12, 19, 25};
        for (int v : values) bst.insert(v);

        System.out.println("=== Initial Tree ===");
        bst.printInorder();

        System.out.println("\n=== 1) SEARCH ===");
        System.out.println("Search 20: " + bst.search(20));
        System.out.println("Search 99: " + bst.search(99));


        System.out.println("\n=== 2) INSERTION ===");
        System.out.println("Insert 18");
        bst.insert(18);
        bst.printInorder();

        System.out.println("\n=== 3) DELETION ===");
        System.out.println("Delete 15");
        bst.delete(15);
        bst.printInorder();

        System.out.println("\n=== 4) FIND MIN ===");
        System.out.println("Min: " + bst.findMin());

 
        System.out.println("\n=== 5) FIND MAX ===");
        System.out.println("Max: " + bst.findMax());
    }
}
