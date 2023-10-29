class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2){
            return 0;
        }
        int max_profit = 0;
        int curr_profit = 0;
        int curr_min = prices[0];
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<curr_min){
                curr_min = prices[i];
            }
            curr_profit = prices[i]-curr_min;
            if(curr_profit>max_profit){
                max_profit = curr_profit;
            }
        }
        return max_profit;
    }
}