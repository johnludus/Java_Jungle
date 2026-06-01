//        Given an array arr[], rearrange its elements according to 1-based indexing such that for every even index i,
//        arr[i] is greater than or equal to arr[i-1],
//        and for every odd index i, arr[i] is less than or equal to arr[i-1].
//        Return the rearranged array that satisfies these conditions for all valid indices.

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
                if (array[i]<array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }
            else{
                if (array[i]>array[i+1]){
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
