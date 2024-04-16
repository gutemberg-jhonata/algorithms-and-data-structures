package bst;

public class BinarySearchTree {
    private TreeNode root;
    
    private class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public boolean search(int target) {
        return search(root, target);
    }

    public void insert(int val) {
        insert(root, val);
    }

    public TreeNode minValueNode() {
        var curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public TreeNode remove(int val) {
        return remove(root, val);
    }

    private boolean search(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (target > root.val) {
            return search(root.right, target);
        } else if (target < root.val) {
            return search(root.left, target);
        } else {
            return true;
        }
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
                var min = minValueNode();
                root.val = min.val;
                root.right = remove(root.right, min.val);
            }
        }
        return root;
    }

}
