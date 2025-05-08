import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

class MaxProfit {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int buyDay = 0;
        int sellDay = 1;

        ArrayList<Integer> sellDays = new ArrayList<>();

        for (int j = 0; j < prices.length - 1; j++) {
            if (prices[j + 1] < prices[j]) {
                sellDays.add(j);
            }
        }
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (prices[j] > prices[i]) {
                    buyDay = prices[i];
                }
            }
        }
        if (sellDays.size() == 0 || buyDay == 0) {
            return Math.max(0, (prices[prices.length - 1] - prices[0]));
        }
        System.out.println("Days to Sell: " + sellDays);
        int index = 0;
        for (Integer dayToSell : sellDays) {
            int maxProfit = 0;
            System.out.println(dayToSell);
            for (int i = index; i < dayToSell; i++) {
                if ((prices[dayToSell] - prices[i]) > maxProfit) {
                    maxProfit = (prices[dayToSell] - prices[i]);
                    System.out.println("maxProfit: " + maxProfit);
                    index = dayToSell + 1;
                }
            }
            totalProfit += maxProfit;
        }
        if (prices[prices.length - 1] - prices[index] > 0) {
            totalProfit += prices[prices.length - 1] - prices[index];
        }
        return totalProfit;
    }

    public int maximizeProfit(int[] prices) {
        int totalProfit = 0;
        System.out.println("Checkpoint 1");
        ArrayList<Integer> sellDays = new ArrayList<>();
        ArrayList<Integer> profitDays = new ArrayList<>();
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[0]) {
                profitDays.add(prices[i]);
            }
        }
        if (profitDays.size() == 0) {
            System.out.println("There are no profit opportunities");
            return 0;
        }
        for (int j = 0; j < prices.length-2 ; j++) {
            if (prices[j + 1] < prices[j]) {
                sellDays.add(j);
                System.out.println("Total sell days: " + sellDays);
            }
        }
//        sellDays.add(prices.length-1);

        if (sellDays.get(0) == 0) {
            sellDays.remove(0);
        }
        System.out.println("All the sell days: " + sellDays);
        for (Integer dayToSell : sellDays) {
            System.out.println("dayToSell: " + dayToSell);
            int counter =0;
            if (dayToSell == sellDays.get(0)) {
                int maxLocalProfit = 0;
                for (int i = 0; i < dayToSell; i++) {
                    maxLocalProfit = Math.max(prices[dayToSell] - prices[i], maxLocalProfit);
                }
                totalProfit += maxLocalProfit;
                System.out.println("Total profit: " + totalProfit);
                counter = dayToSell + 1;
            } else {
                int maxLocalProfit = 0;
//                for (int i = sellDays.get(dayToSell - 1) + 1; i < dayToSell; i++) {
                  for(int i=counter; i<dayToSell; i++)
                    maxLocalProfit = Math.max(prices[dayToSell] - prices[i], maxLocalProfit);

                totalProfit += maxLocalProfit;
                counter = dayToSell;
                System.out.println("Total profit: " + totalProfit+" counter: " + counter + " day to Sell: "+dayToSell);
//            }

            }

//        int index=0;
//        if(prices[prices.length-1]-prices[index]>0){
//            totalProfit+=prices[prices.length-1]-prices[index];
//        }
        }
        return totalProfit;
    }
}