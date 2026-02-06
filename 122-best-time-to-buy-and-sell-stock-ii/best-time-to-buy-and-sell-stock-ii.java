class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for(int p : prices){
            if(p<minPrice){
                minPrice = p;
            }else{
                maxPrice = maxPrice + (p-minPrice);
                minPrice = p;
            }
        }
        return maxPrice;
    }
}