public class Solution {
    public int maxProfit(int prices[]) {
        
        int maxProfit = 0;
        int maxVal = 0;
        
        for(int i=prices.length-1; i>=0;i--){
            if(prices[i]>maxVal){
                maxVal = prices[i];
            }else{
                maxProfit= Math.max(maxProfit, maxVal-prices[i]);
            }    
        }
        
        return maxProfit;
        // int minprice = Integer.MAX_VALUE;
        // int maxprofit = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < minprice)
        //         minprice = prices[i];
        //     else if (prices[i] - minprice > maxprofit)
        //         maxprofit = prices[i] - minprice;
        // }
        // return maxprofit;
    }
}