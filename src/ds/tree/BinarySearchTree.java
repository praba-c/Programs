package ds.tree;

public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        root = insertValue(root, value);
    }

    public Node insertValue(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertValue(root.left, value);
        } else if (value > root.value) {
            root.right = insertValue(root.right, value);
        }
        return root;
    }
}