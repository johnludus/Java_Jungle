// You are given an array you should arrange in the way that even index has the greatest value as compared to
// near by index.

package Array;

import java.util.Scanner;

public class GreaterEvenPositionIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the array elememts : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(i%2==0){
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }
            else{
                if (array[i]<array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("The modified array is : ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
