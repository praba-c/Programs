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

        System.out.println(isBalanced(tree.root));
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

    public static Node deleteNode(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.value) {
            deleteNode(root.left, value);
        } else if (value > root.value) {
            deleteNode(root.right, value);
        } else {
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            root.value = minValue(root.right);
            root.right = deleteNode(root.right, root.value);
        }
        return root;
    }

    public static int heightOfTheTree(Node root) {
        if (root == null) {
            return -1;
        }
        int left = heightOfTheTree(root.left);
        int right = heightOfTheTree(root.right);
        return 1 + Math.max(left, right);
    }

    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static int checkHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int left = checkHeight(root.left);
        int right = checkHeight(root.right);

        if (Math.abs(right - left) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}