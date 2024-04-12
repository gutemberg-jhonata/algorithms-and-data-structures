package linkedlist.impl;

import linkedlist.LinkedList;

public class SinglyLinkedList2<T> implements LinkedList<T> {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private T val;
        private ListNode next;

        public ListNode() {
            val = null;
            next = null;
        }

        public ListNode(final T val) {
            this.val = val;
            next = null;
        }
    }

    public SinglyLinkedList2() {
        head = new ListNode();
        tail = head;
    }

    @Override
    public T get(final int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        if (curr != null) {
            return curr.val;
        }
        throw new Exception("List is empty.");
    }

    @Override
    public void set(int index, T val) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        if (curr != null) {
            curr.val = val;
            return;
        }
        throw new Exception("List is empty.");
    }

    @Override
    public void insert(T val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        length++;
    }

    @Override
    public void insert(T val, int index) throws Exception {
        if (index < 0 || index > length) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        var newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        if (newNode.next == null) {
            tail = tail.next;
        }
        length++;
        return;
    }

    @Override
    public T remove() throws Exception {
        var curr = head;
        if (curr.next == null) {
            throw new Exception("List is empty.");
        }
        while (curr.next.next != null) {
            curr = curr.next;
        }
        tail = curr;
        tail.next = null;
        length--;
        return tail.val;
    }

    @Override
    public T remove(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head;
        if (curr.next == null) {
            throw new Exception("List is empty.");
        }
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        if (curr.next == null) {
            tail = curr;
            length--;
            return tail.val;
        }
        length--;
        return curr.next.val;
    }

    @Override
    public void print() {
        var curr = head.next;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println(); 
    }

    @Override
    public int length() {
        return length;    
    }
    
}
