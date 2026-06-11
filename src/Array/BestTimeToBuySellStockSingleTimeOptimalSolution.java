package Array;

import java.util.Scanner;

public class BestTimeToBuySellStockSingleTimeOptimalSolution {
    public static int MaxProfit(int[] array , int size){
        int maxProfit = 0;
        int bestDay = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<bestDay){
                bestDay = array[i];
            }
            else{
                maxProfit = Math.max(maxProfit,array[i]-bestDay);
            }

        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int profit = MaxProfit(array , size);
        System.out.println("The profit from the given array is : "+profit);

    }
}
