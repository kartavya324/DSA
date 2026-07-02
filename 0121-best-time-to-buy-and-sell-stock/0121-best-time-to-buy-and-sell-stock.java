class Solution {
    public int maxProfit(int[] prices) {
        int minimumprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price: prices){
            if(price<minimumprice){
                minimumprice=price;
            }
            else{
                int currentProfit=price-minimumprice;
                maxprofit=Math.max(maxprofit,currentProfit);
            }
        }
        return maxprofit;
    }
}