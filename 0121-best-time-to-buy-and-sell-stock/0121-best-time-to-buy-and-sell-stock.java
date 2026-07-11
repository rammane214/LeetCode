// class Solution {

//     public int maxProfit(int[] prices) {

//         int maxProfit = 0;

//         for(int i=0;i<prices.length;i++){

//             for(int j=i+1;j<prices.length;j++){

//                 int profit = prices[j]-prices[i];

//                 maxProfit = Math.max(maxProfit,profit);

//             }

//         }

//         return maxProfit;
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}