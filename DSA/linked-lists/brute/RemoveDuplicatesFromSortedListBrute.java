// Complexity: Time O(n), Space O(n)

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedListBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> unique = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            if (unique.isEmpty() || unique.get(unique.size() - 1) != curr.val) {
                unique.add(curr.val);
            }
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        for (int val : unique) {
            node.next = new ListNode(val);
            node = node.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListBrute solver = new RemoveDuplicatesFromSortedListBrute();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode answer = solver.deleteDuplicates(head);
        while (answer != null) { System.out.print(answer.val + " "); answer = answer.next; }
        System.out.println(); // 1 2
    }
}
