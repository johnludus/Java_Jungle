// Given an array prices[] representing stock prices, find the maximum total profit that can be earned by buying and
// selling the stock any number of times.
//
// Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.
//
// Examples:
//
// Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
// Output: 865
// Explanation: Buy the stock on day 0 and sell it on day 3 = 310 - 100 = 210 and
// Buy the stock on day 4 and sell it on day 6 = 695 - 40 = 655 so the Maximum Profit  is = 210 + 655 = 865.

package Array;

import java.util.Scanner;

public class BestTimeToBuyAndSellStockMultipleTimesOptimalSolution {
    public static int Profit(int[] array , int size){
        int min = array[0],sum=0;
        for(int i=0;i<size-1;i++){
            if(array[i]<array[i+1]){
                sum = sum + (array[i+1]-array[i]);

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int profit = Profit(array , size);
        System.out.println("The profit from the given array is : "+profit);
    }
}
