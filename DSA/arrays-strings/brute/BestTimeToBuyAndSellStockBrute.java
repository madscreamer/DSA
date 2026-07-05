// Complexity: Time O(n^2), Space O(1)

public class BestTimeToBuyAndSellStockBrute {

    public int maxProfit(int[] priceList) {
        int bestProfit = 0;

        for (int i = 0; i < priceList.length - 1; i++) {
            for (int j = i + 1; j < priceList.length; j++) {
                int profit = priceList[j] - priceList[i];
                if (profit > bestProfit) {
                    bestProfit = profit;
                }
            }
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockBrute solver = new BestTimeToBuyAndSellStockBrute();
        System.out.println(solver.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(solver.maxProfit(new int[]{7, 6, 4, 3, 1}));    // 0
    }
}
