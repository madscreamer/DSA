// Complexity: Time O(n log n), Space O(1)

import java.util.Arrays;

public class ContainsDuplicateBrute {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateBrute solver = new ContainsDuplicateBrute();
        System.out.println(solver.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(solver.containsDuplicate(new int[]{1, 2, 3, 4})); // false
    }
}
