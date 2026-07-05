// Complexity: Time O(n), Space O(1)
// store the smallest gap and prefer positive value on tie

public class FindClosestNumberToZeroOptimal {

    public int findClosestNumber(int[] nums) {
        int nearest = nums[0];
        int bestDistance = Math.abs(nums[0]);

        for (int num : nums) {
            int gap = Math.abs(num);
            if (gap < bestDistance) {
                bestDistance = gap;
                nearest = num;
            } else if (gap == bestDistance && num > nearest) {
                nearest = num;
            }
        }
        return nearest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZeroOptimal solver = new FindClosestNumberToZeroOptimal();
        System.out.println(solver.findClosestNumber(new int[]{-4, -2, 1, 4, 8})); // 1
        System.out.println(solver.findClosestNumber(new int[]{2, -1, 1}));        // 1
    }
}
