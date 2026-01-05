package Code;

class ListNode {
    int val;
    ListNode next;

    ListNode(int v) {
        val = v;
    }
}

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        a.next = b;
        b.next = a;
        System.out.println(hasCycle(a));
    }
}
