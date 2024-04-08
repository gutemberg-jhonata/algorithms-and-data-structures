package linkedlist;

import linkedlist.impl.DoublyLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new DoublyLinkedList<>();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.insert(25, 2);
        list.print();
        list.insert(35, 4);
        list.print();
        /*list.remove();
        list.remove();
        list.remove();*/
        list.print();
        list.remove(3);
        list.print();
        //list.remove(6);
        //list.print();
        list.remove(0);
        list.print();
        list.set(4, 60);
        list.print();
    }
}
