//Given a number x and an array of integers arr, find the smallest subarray with sum strictly
//        greater than the given value. If such a subarray do not exist return 0 in that case.
//
//        Examples:
//
//        Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
//        Output: 3
//        Explanation: Minimum length subarray is [4, 45, 6]
//        Input: x = 100, arr[] = [1, 10, 5, 2, 7]
//        Output: 0
//        Explanation: No subarray exist
package Array;

import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {
    static int SmallestSubarray(int[] array , int X , int size){
        int minLen = Integer.MAX_VALUE;
        int len = 0;
        int k=0;

        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int sum = 0;
                for(k=i;k<=j;k++){
                    sum+=array[k];
                }
                len = j-i+1;
                if(sum>X && len<minLen){
                    minLen = len;
                }
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        else
            return minLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the value of X : ");
        int X = sc.nextInt();
        int length = SmallestSubarray(array, X , size);
        System.out.println("The length of Smallest Subarray with sum greater than X is : "+length);

    }
}
