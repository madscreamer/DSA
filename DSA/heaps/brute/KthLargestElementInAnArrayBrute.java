// Complexity: Time O(n log n), Space O(1)

import java.util.Arrays;

public class KthLargestElementInAnArrayBrute {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestElementInAnArrayBrute solver = new KthLargestElementInAnArrayBrute();
        System.out.println(solver.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); // 5
        System.out.println(solver.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); // 4
    }
}
