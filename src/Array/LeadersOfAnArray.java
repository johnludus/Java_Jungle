package Array;

import java.util.Scanner;

public class LeadersOfAnArray {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the array elememt : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        // Leader of an array.
        for(int i=size-1;i>=0;i--){
            if(array[i]>max){
                max = array[i];
                System.out.print(array[i]+" ");
            }

        }

    }
}
