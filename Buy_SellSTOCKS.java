
public class Buy_SellSTOCKS {
    public static int Buy_Sell_Stocks(int prices[]) {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buy_price < prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = prices[i];
            }
        }
        return max_profit;

    }

    public static void main(String[] arg) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int Max_Profit = Buy_Sell_Stocks(prices);
        System.out.print("Max Profit will be: " + Max_Profit);

    }

}
