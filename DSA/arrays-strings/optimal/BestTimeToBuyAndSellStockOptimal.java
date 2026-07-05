// Complexity: Time O(n), Space O(1)
// keep the minimum buying price and update the best profit

public class BestTimeToBuyAndSellStockOptimal {

    public int maxProfit(int[] priceList) {
        int lowestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int price : priceList) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else if (price - lowestPrice > bestProfit) {
                bestProfit = price - lowestPrice;
            }
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockOptimal solver = new BestTimeToBuyAndSellStockOptimal();
        System.out.println(solver.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(solver.maxProfit(new int[]{7, 6, 4, 3, 1}));    // 0
    }
}
