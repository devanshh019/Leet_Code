class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int curr = 0;

        for (int i = 1; i < prices.length; i++) {
            int buy = prices[i - 1];
            int sell = prices[i];
            curr = sell - buy;
            if (curr > 0) {
                ans += curr;
            }
        }
        return ans;
    }
}