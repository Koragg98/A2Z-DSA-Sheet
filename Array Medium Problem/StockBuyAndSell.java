package ArrayMediumProblem;

/**
 * @author iraki
 */
public class StockBuyAndSell {

    public static void printDay(int buyDay,int sellDay)
    {
        System.out.println("Buy on day: "+buyDay);
        System.out.println("Sell on day: "+sellDay);
    }
    public static int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int buyDay=1;
        int sellDay=1;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-minPrice;
            //maxProfit=Math.max(maxProfit,profit);
            
            if(profit>maxProfit)
            {
                maxProfit=profit;
                
                    sellDay=i+1;
                
            }
            //minPrice=Math.min(minPrice,prices[i]);
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
                
                    buyDay=i+1;
            }
        }
        
//        if(buyDay>sellDay)
//            buyDay=sellDay;

// Ensuring that buy day is always before sell day
        if (buyDay >= sellDay) {
            System.out.println("No profitable transactions possible.");
            return 0; // or handle appropriately
        }
        printDay(buyDay,sellDay);
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
}
