class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <=1 )
            return 0;
        int max = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i=0; i< prices.length ;i++){
            buyingPrice = Math.min(buyingPrice,prices[i]);
            max = Math.max(prices[i]-buyingPrice, max) ;
        }
        return max;
    }
}