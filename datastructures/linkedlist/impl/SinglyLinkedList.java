package linkedlist.impl;

import java.util.ArrayList;

public class SinglyLinkedList {
    private ListNode head;
    private ListNode tail;

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(final int val) {
            this.val = val;
        }
    }

    public SinglyLinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        int i = 0;
        var curr = head.next;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        var newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        var newNode = new ListNode(val);
        tail.next = newNode;
        tail = newNode; // tail = tail.next
    }

    public boolean remove(int index) {
        int i = 0;
        var curr = head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        if (curr != null && curr.next != null) {
            if (curr.next == tail) {
                tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        var values = new ArrayList<Integer>();
        var curr = head.next;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}
