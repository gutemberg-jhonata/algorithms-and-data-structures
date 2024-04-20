package linkedlist.impl;

public class Doubly {
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

    public Doubly() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }

    public void insert(int val) {
        var newNode = new ListNode(val);
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        lenght++;
    }

    public void insert(int val, int index) {
        //
        int i = 0;
        var cur = head.next;
        while (i < index) {
            i++;
            cur = cur.next;
        }
        var newNode = new ListNode(val);
        newNode.prev = cur.prev;
        newNode.next = cur;
        cur.prev.next = newNode;
        cur.prev = newNode;
        lenght++;
    }

    public void remove() {
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
        lenght--;
    }

    public void remove(int index) {
        //
        int i = 0;
        var cur = head.next;
        while (i < index) {
            i++;
            cur = cur.next;
        }
        cur.prev.next = cur.next;
        cur.next.prev = cur.prev;
        lenght--;
    }
}
