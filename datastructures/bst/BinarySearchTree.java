package bst;

public class BinarySearchTree {
    private TreeNode root;

    public boolean search(int target) {
        return search(root, target);
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode minValueNode(TreeNode root) {
        var curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public TreeNode remove(int val) {
        return remove(root, val);
    }

    public void printInorder() {
        printInorder(root);
        System.out.println();
    }

    public void printReverseInorder() {
        printReverseInorder(root);
        System.out.println();
    }

    public void printPreorder() {
        printPreorder(root);
        System.out.println();
    }

    public void printPosorder() {
        printPosorder(root);
        System.out.println();
    }

    public TreeNode getRoot() {
        return this.root;
    }

    private boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (target > root.val) {
            return search(root.right, target);
        } else if (target < root.val) {
            return search(root.left, target);
        }
        return true;
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val > root.val) {
            root.right = insert(root.right, val);
        } else if (val < root.val) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public TreeNode remove(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.val) {
            root.right = remove(root.right, val);
        } else if (val < root.val) {
            root.left = remove(root.left, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                var min = minValueNode(root.right);
                root.val = min.val;
                root.right = remove(root.right, min.val);
            }
        }
        return root;
    }

    private void printInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.val + ", ");
        printInorder(root.right);
    }

    private void printReverseInorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printReverseInorder(root.right);
        System.out.print(root.val + ", ");
        printReverseInorder(root.left);
    }

    private void printPreorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + ", ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    private void printPosorder(TreeNode root) {
        if (root == null) {
            return;
        }
        printPreorder(root.left);
        printPreorder(root.right);
        System.out.print(root.val + ", ");
    }

}
