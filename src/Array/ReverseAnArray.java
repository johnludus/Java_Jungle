package Array;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        for(int i=0;i<5;i++){
            array[i] = sc.nextInt();
        }
        int len = array.length;
        for(int i=0;i<len/2;i++){
            int temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] =  temp;
        }
        System.out.print("Reversed array : ");
        for(int i=0;i<len;i++){
            System.out.print(array[i]+" ");
        }
    }
}
