package algorithms.breadthfirstsearch;

import java.util.ArrayDeque;
import java.util.Deque;

import bst.TreeNode;

public class BFS {
    
    public void search(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while (!queue.isEmpty()) {
            System.out.print("level " + level + ": ");
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode curr = queue.removeFirst();
                System.out.print(curr.val + " ");
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            level++;
            System.out.println();
        }
    }

}
