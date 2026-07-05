// Complexity: Time O(n), Space O(1)
// move the pointer with the smaller walls

public class ContainerWithMostWaterOptimal {

    public int maxArea(int[] walls) {
        int low = 0;
        int high = walls.length - 1;
        int bestArea = 0;

        while (low < high) {
            int area = (high - low) * Math.min(walls[low], walls[high]);
            bestArea = Math.max(bestArea, area);

            if (walls[low] < walls[high]) {
                low++;
            } else {
                high--;
            }
        }
        return bestArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWaterOptimal solver = new ContainerWithMostWaterOptimal();
        System.out.println(solver.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
    }
}
