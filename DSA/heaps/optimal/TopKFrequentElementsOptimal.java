// Complexity: Time O(n log k), Space O(n+k)
// use a small heap and remove the least frequent item

import java.util.*;

public class TopKFrequentElementsOptimal {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) frequency.merge(num, 1, Integer::sum);

        PriorityQueue<Integer> smallHeap = new PriorityQueue<>(
            (a, b) -> frequency.get(a) - frequency.get(b)
        );

        for (int num : frequency.keySet()) {
            smallHeap.offer(num);
            if (smallHeap.size() > k) smallHeap.poll();
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) answer[i] = smallHeap.poll();
        return answer;
    }

    public static void main(String[] args) {
        TopKFrequentElementsOptimal solver = new TopKFrequentElementsOptimal();
        System.out.println(Arrays.toString(solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // [2, 1]
        System.out.println(Arrays.toString(solver.topKFrequent(new int[]{1}, 1)));                 // [1]
    }
}
