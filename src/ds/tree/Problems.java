package ds.tree;

public class Problems {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(2);
        tree.insert(5);
        tree.insert(1);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);

        System.out.println(search(tree.root, 7));
    }

    public static boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        if (value < root.value) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.value);
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value);
    }

    public static int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    public static int maxValue(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.value;
    }

    public static void deleteNode(Node root, int value) {
        if (root == null) {
            return;
        }
        if (root.value == value) {
            return;
        }
        if (value < root.value) {
            deleteNode(root.left, value);
        } else {
            deleteNode(root.right, value);
        }
    }
}
