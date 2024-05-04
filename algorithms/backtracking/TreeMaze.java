package algorithms.backtracking;

import java.util.List;

public class TreeMaze {
    
    public class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public boolean canReachLeaf(TreeNode root) {
        if (root == null || root.val == 0) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (canReachLeaf(root.left)) {
            return true;
        }
        if (canReachLeaf(root.right)) {
            return true;
        }
        return false;
    }

    public boolean leafPath(TreeNode root, List<Integer> path) {
        if (root == null || root.val == 0) {
            return false;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            return true;
        }
        if (leafPath(root.left, path)) {
            return true;
        }
        if (leafPath(root.right, path)) {
            return true;
        }
        path.removeLast();
        return false;
    }

}
