/* QUESTION 2 — Detect Cycle in LinkedList (Floyd’s Algorithm)

Given the head of a linked list, determine whether a cycle exists.
Use slow & fast pointer technique.

Example:
3 → 2 → 0 → -4 and tail connects to node index 1 → cycle exists.*/

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = next;
    }
}

public class DetectCycleLinkedList {
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.println(hasCycle(head));
    }
}