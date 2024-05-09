package bst.map;

import java.util.ArrayList;
import java.util.List;

public class TreeMap {

    private TreeNode root;

    private class TreeNode {
        private int key;
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int key, int val) {
            this.key = key;
            this.val = val;
            left = null;
            right = null;
        }
    }

    public TreeMap() {
        root = null;
    }

    public void insert(int key, int val) {
        root = insert(root, key, val);
    }

    public int get(int key) {
        return get(root, key);
    }

    public int getMin() {
        TreeNode min = getMinTreeNode(root);
        if (min == null) {
            return -1;
        }
        return min.val;
    }

    public int getMax() {
        if (root == null) {
            return -1;
        }
        TreeNode curr = root;
        while (curr != null && curr.right != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public void remove(int key) {
       root = remove(root, key);
    }

    public List<Integer> getInorderKeys() {
        List<Integer> keys = new ArrayList<>();
        getInorderKeys(root, keys);
        return keys;
    }

    private TreeNode insert(TreeNode root, int key, int val) {
        if (root == null) {
            return new TreeNode(key, val);
        }
        if (key > root.key) {
            root.right = insert(root.right, key, val);
        } else if (key < root.key) {
            root.left = insert(root.left, key, val);
        } else {
            root.val = val;
        }
        return root;
    }

    private int get(TreeNode root, int key) {
        if (root == null) {
            return -1;
        }
        if (key > root.key) {
            return get(root.right, key);
        } else if (key < root.key) {
            return get(root.left, key);
        }
        return root.val;
    }

    private TreeNode getMinTreeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    private TreeNode remove(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.key) {
            root.right = remove(root.right, key);
        } else if (key < root.key) {
            root.left = remove(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode min = getMinTreeNode(root.right);
                root.key = min.key;
                root.val = min.val;
                root.right = remove(root.right, min.key);
            }
        }
        return root;
    }

    private Integer getInorderKeys(TreeNode root, List<Integer> keys) {
        if (root == null) {
            return null;
        }
        getInorderKeys(root.left, keys);
        keys.add(root.key);
        getInorderKeys(root.right, keys);
        return root.key;
    }
}
