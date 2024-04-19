package linkedlist.impl;

public class IntSinglyLinkedList2 {
    private ListNode head;
    private ListNode tail;
    private int lenght;

    public class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public IntSinglyLinkedList2() {
        head = new ListNode(-1);
        tail = head;
        lenght = 0;
    }

    public void insert(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        lenght++;
    }

    public void insert(int val, int index) {
        if (index < 0 || index > lenght) {
            return;
        }
        int i = 0;
        var curr = head;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        var newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        lenght++;
    }

    public int remove() {
        if (lenght == 0) {
            return -1;
        }
        var curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        int val = curr.next.val;
        //curr.next = curr.next.next;
        curr.next = null;
        tail = curr;
        lenght--;
        return val;
    }

    public int remove(int index) {
        if (index < 0 || index > lenght - 1) {
            return -1;
        }
        /*if (lenght == 0) {
            return -1;
        }*/
        int i = 0;
        var curr = head;
        while (i < index) {
            i++;
            curr = curr.next;
        }
        int val = curr.next.val;
        curr.next = curr.next.next;
        if (curr.next == null) {
            tail = curr;
        }
        lenght--;
        return val;
    }

}