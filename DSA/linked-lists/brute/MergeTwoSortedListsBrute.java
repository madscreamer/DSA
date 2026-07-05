// Complexity: Time O(n log n), Space O(n)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsBrute {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> vals = new ArrayList<>();

        while (list1 != null) { vals.add(list1.val); list1 = list1.next; }
        while (list2 != null) { vals.add(list2.val); list2 = list2.next; }
        Collections.sort(vals);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) { curr.next = new ListNode(v); curr = curr.next; }
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedListsBrute solver = new MergeTwoSortedListsBrute();
        ListNode l1 = new ListNode(1); l1.next = new ListNode(2); l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1); l2.next = new ListNode(3); l2.next.next = new ListNode(4);
        ListNode res = solver.mergeTwoLists(l1, l2);
        while (res != null) { System.out.print(res.val + " "); res = res.next; }
        System.out.println(); // 1 1 2 3 4 4
    }
}
