// Complexity: Time O(n), Space O(n)

import java.util.HashSet;

public class LinkedListCycleBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (visited.contains(curr)) return true;
            visited.add(curr);
            curr = curr.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycleBrute solver = new LinkedListCycleBrute();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        n1.next = n2; n2.next = n3; n3.next = n2; // cycle
        System.out.println(solver.hasCycle(n1)); // true
    }
}
