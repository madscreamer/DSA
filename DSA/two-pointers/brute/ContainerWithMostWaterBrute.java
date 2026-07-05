// Complexity: Time O(n^2), Space O(1)

public class ContainerWithMostWaterBrute {

    public int maxArea(int[] walls) {
        int bestArea = 0;

        for (int i = 0; i < walls.length - 1; i++) {
            for (int j = i + 1; j < walls.length; j++) {
                int area = (j - i) * Math.min(walls[i], walls[j]);
                bestArea = Math.max(bestArea, area);
            }
        }
        return bestArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWaterBrute solver = new ContainerWithMostWaterBrute();
        System.out.println(solver.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); // 49
    }
}
