package linkedlist.impl;

import linkedlist.LinkedList;

public class DoublyLinkedList<T> implements LinkedList<T>{
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private T val;
        private ListNode prev;
        private ListNode next;
        
        public ListNode() {
            val = null;
            prev = null;
            next = null;
        }

        public ListNode(final T val) {
            this.val = val;
            prev = null;
            next = null;
        }
    }

    public DoublyLinkedList() {
        head = new ListNode();
        tail = new ListNode();
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public T get(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (curr != null) {
            if (index == i) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return null;
    }

    @Override
    public void set(int index, T val) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (curr != null) {
            if (index == i) {
                curr.val = val;
                return;
            }
            i++;
            curr = curr.next;
        }    
    }

    @Override
    public void insert(T val) {
        var newNode = new ListNode(val);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        length++;
    }

    @Override
    public void insert(T val, int index) throws Exception {
        if (index < 0 || index > length) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (curr != null) {
            if (i == index) {
                var newNode = new ListNode(val);
                newNode.prev = curr.prev;
                newNode.next = curr;
                curr.prev.next = newNode;
                curr.prev = newNode;
                length++;
            }
            i++;
            curr = curr.next;
        }
    }

    @Override
    public T remove() throws Exception {
        if (head.next == tail) {
            throw new Exception("Empty list.");
        }
        var val = tail.prev.val;
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
        length--;
        return val;
    }

    @Override
    public T remove(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("Index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (curr != null) {
            if (index == i) {
                var val = curr.val;
                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                length--;
                return val;
            }
            i++;
            curr = curr.next;
        }
        return null;   
    }

    @Override
    public void print() {
        var curr = head.next;
        while (curr.next != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    @Override
    public int length() {
        return this.length;    
    }

}
