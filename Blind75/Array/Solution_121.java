package Blind75.Array;

class Solution_121 {
    public int maxProfit(int[] prices) {
        int choosenDay = 0, i = 1, maxProfit = 0;
        while(i < prices.length){
            if(prices[i] < prices[choosenDay]){
                choosenDay = i;
            }
            else{
                maxProfit = Math.max(maxProfit, prices[i]-prices[choosenDay]);
            }
            i++;
        }
        return maxProfit;
    }
}
