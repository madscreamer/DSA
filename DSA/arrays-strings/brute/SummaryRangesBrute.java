// Complexity: Time O(n), Space O(n)

import java.util.*;

public class SummaryRangesBrute {

    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int rangeStart = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (rangeStart == nums[i]) {
                answer.add(String.valueOf(rangeStart));
            } else {
                answer.add(rangeStart + "->" + nums[i]);
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        SummaryRangesBrute solver = new SummaryRangesBrute();
        System.out.println(solver.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));    // [0->2, 4->5, 7]
        System.out.println(solver.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})); // [0, 2->4, 6, 8->9]
    }
}
