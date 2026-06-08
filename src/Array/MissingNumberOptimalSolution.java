//Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
//        This array represents a permutation of the
//        integers from 1 to n with one element missing.
//        Find the missing element in the array.
//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//        Output: 6
//        Explanation: All the numbes from 1 to 8 are present except 6.

package Array;

import java.util.Scanner;

public class MissingNumberOptimalSolution {
    public static int FindMissingNumber(int[] array , int size){
        int sum = 0;
        int n = size+1;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        long forSum = (n*(n+1))/2;
        return (int)forSum-sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements for an array : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int missingNum = FindMissingNumber(array , size);
        System.out.println("Hence the missing number in a given array : "+missingNum);
    }
}
