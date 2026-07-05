// Complexity: Time O(n), Space O(n)
// keep the starting index of every continuous range

import java.util.*;

public class SummaryRangesOptimal {

    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int rangeStartIndex = i;
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (nums[rangeStartIndex] == nums[i]) {
                answer.add(String.valueOf(nums[rangeStartIndex]));
            } else {
                answer.add(nums[rangeStartIndex] + "->" + nums[i]);
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        SummaryRangesOptimal solver = new SummaryRangesOptimal();
        System.out.println(solver.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));    // [0->2, 4->5, 7]
        System.out.println(solver.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})); // [0, 2->4, 6, 8->9]
    }
}
