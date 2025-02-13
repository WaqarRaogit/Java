import java.util.*;

public class DSAsheet {
public static int trappedRainWater(int height[]){

    //calculate left max boundary
           int n = height.length;

        int leftMax[] = new int [n];

        leftMax[0] = height[0];
            for(int i=1; i < n; i++){
                    leftMax[i] =  Math.max(height[i] , leftMax[i-1]);
            }
    //calculate right max boundary
        
        int rightMax[] = new int[n];

        rightMax[n-1] = height[n-1];
            for(int i = n-2; i>= 0; i--){

                rightMax[i] = Math.max(height[i], rightMax[i+1]);
            }
    //trapped rainwater

    int trappedWater = 0;
   
    //Loop

            for(int i=0; i<n; i++){
            
                int waterlevel = Math.min(leftMax[i], rightMax[i]);
                trappedWater += (waterlevel - height[i]);

            }
                    // System.out.println(trappedWater);
                   return trappedWater;

}

    public static void main(String args[]){

        int height[] = {4, 2, 0, 3, 2, 5};

        //trappedRainWater(height);
        System.out.println(trappedRainWater(height));
    }
    

// public static int BuyandSellStocks(int prices[]){

//     int buyPrice = Integer.MAX_VALUE;
//     int  maxProfit = 0;

//         for(int i = 0; i < prices.length; i++){
//             if( buyPrice < prices[i]){
//                 int Profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, Profit);
//             }
//             else{
//                 buyPrice = prices[i];
//             }
//         }
//                     return maxProfit;
// }

// public static void main(String args[]){

//     int height[] = {7, 1, 5, 3, 6, 4};
//     System.out.println(BuyandSellStocks(height));
// }

}
