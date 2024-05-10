package algorithms.backtracking;

import java.util.List;

import bst.TreeNode;

public interface Maze {
    boolean canReachLeaf(TreeNode root);
    boolean leafPath(TreeNode root, List<Integer> path);
}
