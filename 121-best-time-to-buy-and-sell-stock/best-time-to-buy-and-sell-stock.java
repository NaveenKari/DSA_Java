class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProf = 0;

        for(int p: prices){
            if(p < minPrice){
                minPrice = p;
            }else{
                maxProf = Math.max(maxProf,p-minPrice);
            }
        }
        return maxProf;




        // int maxPro = 0;
        // for(int i = 0; i < prices.length; i++){
        //     int j = prices.length - 1;

        //     while(j>i){
        //         int prof = prices[j]-prices[i];
        
        //         maxPro = Math.max(maxPro,prof);
        //         j--;
        //     }
        // }
        // return maxPro;
    }
}