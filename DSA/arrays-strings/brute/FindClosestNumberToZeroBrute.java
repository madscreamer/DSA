// Complexity: Time O(n), Space O(1)

public class FindClosestNumberToZeroBrute {

    public int findClosestNumber(int[] nums) {
        int nearest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i]) < Math.abs(nearest)) {
                nearest = nums[i];
            }
            // if same gap, prefer positive number
            if (Math.abs(nums[i]) == Math.abs(nearest) && nums[i] > nearest) {
                nearest = nums[i];
            }
        }
        return nearest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroBrute solver = new FindClosestNumberToZeroBrute();
        System.out.println(solver.findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // 1
        System.out.println(solver.findClosestNumber(new int[]{2, -1, 1}));        // 1
    }
}
