// Complexity: Time O(n log n), Space O(n)

import java.util.*;

public class TopKFrequentElementsBrute {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) frequency.merge(num, 1, Integer::sum);

        List<Integer> values = new ArrayList<>(frequency.keySet());
        values.sort((a, b) -> frequency.get(b) - frequency.get(a));

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) answer[i] = values.get(i);
        return answer;
    }

    public static void main(String[] args) {
        TopKFrequentElementsBrute solver = new TopKFrequentElementsBrute();
        System.out.println(Arrays.toString(solver.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); // [1, 2]
        System.out.println(Arrays.toString(solver.topKFrequent(new int[]{1}, 1)));                 // [1]
    }
}
