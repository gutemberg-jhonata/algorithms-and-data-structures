package linkedlist.impl;

public class IntSinglyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public IntSinglyLinkedList() {
        head = new ListNode(-1);
        tail = head;
        length = 0;
    }

    public int get(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        return curr.val;
    }

    public void set(int val, int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("index out of bounds.");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        curr.val = val;
    }

    public void insert(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        length++;
    }

    public void insert(int val, int index) throws Exception {
        if (index < 0 || index > length) {
            throw new Exception("index out of bounds.");
        }
        int i = 0;
        var curr = head;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        var newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        if (newNode.next == null) {
            tail = tail.next;
        }
        length++;      
    }

    public int remove() throws Exception {
        var curr = head;
        if (curr.next == null) {
            throw new Exception("empty list");
        }
        while (curr.next.next != null) {
            curr = curr.next;
        }
        int val = curr.next.val;
        tail = curr;
        tail.next = null;
        length--;
        return val;
    }

    public int remove(int index) throws Exception {
        if (index < 0 || index > length - 1) {
            throw new Exception("index out of bounds.");
        }
        int i = 0;
        var curr = head;
        if (curr.next == null) {
            throw new Exception("empty list");
        }
        while (i < index) {
            curr = curr.next;
            i++;
        }
        int val = curr.next.val;
        curr.next = curr.next.next;
        if (curr.next == null) {
            tail = curr;
        }
        length--;
        return val;
    }

    public void print() {
        var curr = head.next;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
