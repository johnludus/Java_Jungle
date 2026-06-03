package Array;

import java.util.Scanner;

public class SumOfSubArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int start = 0;start<size;start++){
            int temp = 0;
            for(int end = start;end<size;end++){
                temp+=array[end];            //Used to store sum of current subarray
                sum+=temp;                   //Used to store sum of all subarrays.
                }
            }

        System.out.print("Sum of all subarrays : "+sum);
    }
}
