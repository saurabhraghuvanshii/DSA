public class BuySellStock{

    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    //second type of buy and sell 
    public static int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        int len = prices.length;
        for(int i = 1;i<len; i++){
            if(start < prices[i]) {
            
            max += prices[i] - start;
            start = prices[i];
            }else{
                start = prices[i];
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; //O(n)
        System.out.println(buyAndSellStock(prices));
        System.out.println(maxProfit(prices));
         
    }
}