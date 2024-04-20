package linkedlist.impl;

public class IntDoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int lenght;

    private class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
            prev = null;
            next = null;
        }
    }

    public IntDoublyLinkedList() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) throws Exception {
        if (index < 0 || index > lenght - 1) {
            throw new Exception("index out of bounds");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        return curr.val;
    }

    public void set(int val, int index) throws Exception {
        if (index < 0 || index > lenght - 1) {
            throw new Exception("index out of bounds");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        curr.val = val;
    }
    
    public void insert(int val) throws Exception {
        var newNode = new ListNode(val);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        lenght++;
    }

    public void insert(int val, int index) throws Exception {
        if (index < 0 || index > lenght) {
            throw new Exception("index out of bounds");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        var newNode = new ListNode(val);
        newNode.prev = curr.prev;
        newNode.next = curr;
        curr.prev.next = newNode;
        curr.prev = newNode;
        lenght++;
    }

    public void remove() throws Exception {
        if (lenght == 0) {
            throw new Exception("list is already empty");
        }
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev; 
        lenght--;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index > lenght - 1) {
            throw new Exception("index out of bounds");
        }
        int i = 0;
        var curr = head.next;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;
        lenght--;
    }
}