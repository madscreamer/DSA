// Complexity: Time O(n), Space O(n)

import java.util.HashSet;

public class ContainsDuplicateOptimal {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateOptimal solver = new ContainsDuplicateOptimal();
        System.out.println(solver.containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(solver.containsDuplicate(new int[]{1, 2, 3, 4})); // false
    }
}
