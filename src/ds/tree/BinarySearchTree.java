package ds.tree;

public class BinarySearchTree {
    static Node root;

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

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
    }

    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
}