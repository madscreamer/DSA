// Complexity: Time O(n log k), Space O(k)
// keep only k largest values in the heap

import java.util.PriorityQueue;

public class KthLargestElementInAnArrayOptimal {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> smallHeap = new PriorityQueue<>();

        for (int num : nums) {
            smallHeap.offer(num);
            if (smallHeap.size() > k) {
                smallHeap.poll();
            }
        }
        return smallHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAnArrayOptimal solver = new KthLargestElementInAnArrayOptimal();
        System.out.println(solver.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));          // 5
        System.out.println(solver.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); // 4
    }
}
