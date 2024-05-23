package bst;

public class Main {
    
    public static void main(String[] args) {
        var bst = new BinarySearchTree();
        bst.printInorder();
        bst.insert(10);
        bst.insert(5);
        bst.insert(4);
        bst.insert(8);
        bst.insert(-3);
        bst.insert(0);
        bst.insert(55);
        bst.printInorder();
        bst.printReverseInorder();
        bst.remove(-3);
        bst.printInorder();
        bst.remove(8);
        bst.printInorder();
        bst.printPreorder();
        bst.printPosorder();
        System.out.println(bst.search(8));
        System.out.println(bst.search(10));
    }
    
}
