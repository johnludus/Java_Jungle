package Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array element : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the target to rotate : ");
        int target = sc.nextInt();
        int [] rotateArray = new int[size];
        int j=0;
        for(int i=size-target;i<size;i++){
            rotateArray[j++] = array[i];
        }
        for(int i=0;i<size-target;i++){
            rotateArray[j++] = array[i];
        }
        for(int i=0;i<size;i++){
            System.out.print(rotateArray[i]+" ");
        }
    }
}
