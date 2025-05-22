class Solution {
    public int maxProfit(int[] prices) {
       int i = 0;
       int j = 1;

       int maxProfit = 0;

       while ( j < prices.length){
            if(prices[i]>=prices[j]){
                i=j;
                j++;
            }
            else{
                int temp = prices[j] - prices[i];
                maxProfit = temp > maxProfit ? temp : maxProfit;
                j++;
            }
       }

       return maxProfit;

    }
}