package algorithms.breathfirstsearch;

import bst.BinarySearchTree;
import bst.TreeNode;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        var bst = new BinarySearchTree();
        var bfs = new BFS();
        bst.insert(10);
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(-3);
        bst.insert(0);
        bst.insert(55);
        TreeNode root = bst.getRoot();
        bfs.search(root);
    }
    
}