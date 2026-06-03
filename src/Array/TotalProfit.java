//The idea is that profit only comes when prices rise. If the price goes up from one day to the next,
//        we can think of it as buying yesterday and selling today. Instead of waiting for the exact bottom and top,
//        we simply grab every small upward move. Adding these small gains together is the same as if we had bought at
//        each valley and sold at each peak because every rise between them gets counted.
package Array;

import java.util.Scanner;

public class TotalProfit {
    public static int SumOfProfit(int[] array , int size){
        int total = 0;
        for(int i=1;i<size;i++){
            if(array[i]>array[i-1]){
                total+=(array[i]-array[i-1]);
            }
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int profit = SumOfProfit(array,size);
        System.out.println("The Total Profit : "+profit);
    }
}
