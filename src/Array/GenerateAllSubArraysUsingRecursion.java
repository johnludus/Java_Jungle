package Array;

import java.util.Scanner;

public class GenerateAllSubArraysUsingRecursion {
    public static int SubArrays(int[] array , int start , int size){
        if(start==size){
            return 1;
        }
        System.out.print("The Subarray are : ");
        for (int end = start ; end < size ; end++){
            for(int i = start;i<=end;i++){
                System.out.print(array[i]);
            }
            System.out.print(" ");
        }
        System.out.println();
        SubArrays(array , start+1 , size);
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int start =0;
        SubArrays(array , start ,size);
    }
}
