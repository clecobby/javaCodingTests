public class biggestProfitinTwoNums {
    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int result = maxProfit(nums);
    
        System.out.println(result);
    
      }

    public static int maxProfit(int[] prices) {
        int profit =0;
        int min = prices[0];
        for (int i=0; i<prices.length;i++){
            if (prices[i]<min){
                min = prices[i];

            }
            //find the max of tthe current and min
            profit = Math.max(profit,prices[i]-min);
        }

        return profit;
    }   
    
}
