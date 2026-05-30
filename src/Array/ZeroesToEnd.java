package Array;

import java.util.Scanner;

public class ZeroesToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] array = new int[n];

        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int count = 0,j=0;
        for(int i=0;i<n;i++){
            if(array[i]==0){
                count++;
            }
            else{
                array[j++] = array[i];
            }
        }
        while(count>0){
            array[j++] = 0;
            count--;
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }
}
