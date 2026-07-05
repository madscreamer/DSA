// Complexity: Time O(n), Space O(1)
// Floyd's cycle detection: fast moves 2 steps, slow moves 1, they meet if cycle exists

public class LinkedListCycleOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleOptimal solver = new LinkedListCycleOptimal();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        n1.next = n2; n2.next = n3; n3.next = n2; // cycle
        System.out.println(solver.hasCycle(n1)); // true
    }
}
