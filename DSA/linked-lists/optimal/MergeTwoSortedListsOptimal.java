// Complexity: Time O(n+m), Space O(1)
// use dummy head, always attach the smaller node

public class MergeTwoSortedListsOptimal {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedListsOptimal solver = new MergeTwoSortedListsOptimal();
        ListNode l1 = new ListNode(1); l1.next = new ListNode(2); l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
        ListNode res = solver.mergeTwoLists(l1, l2);
        while (res != null) { System.out.print(res.val + " "); res = res.next; }
        System.out.println(); // 1 1 2 3 4 4
    }
}
