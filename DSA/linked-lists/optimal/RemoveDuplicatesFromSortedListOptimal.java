// Complexity: Time O(n), Space O(1)
// skip next node if it has the same value as current

public class RemoveDuplicatesFromSortedListOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListOptimal solver = new RemoveDuplicatesFromSortedListOptimal();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode answer = solver.deleteDuplicates(head);
        while (answer != null) { System.out.print(answer.val + " "); answer = answer.next; }
        System.out.println(); // 1 2
    }
}
