package Array;

import java.util.Scanner;

public class GenerteAllSubArraysBruteForce {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("All subarrays Are : ");
        for (int start = 0;start<size;start++){
            for(int end = start;end<size;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(array[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
