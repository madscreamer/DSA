// Complexity: Time O(n log n), Space O(n)
// max heap helps pick the two heaviest stones quickly

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeightOptimal {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> bigHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int s : stones) bigHeap.offer(s);

        while (bigHeap.size() > 1) {
            int y = bigHeap.poll();
            int x = bigHeap.poll();
            if (x != y) bigHeap.offer(y - x);
        }

        return bigHeap.isEmpty() ? 0 : bigHeap.peek();
    }

    public static void main(String[] args) {
        LastStoneWeightOptimal solver = new LastStoneWeightOptimal();
        System.out.println(solver.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})); // 1
    }
}
