class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            int sp=prices[i];
            profit=Math.max(profit,sp-bp);
        }

        return profit;
    }
}