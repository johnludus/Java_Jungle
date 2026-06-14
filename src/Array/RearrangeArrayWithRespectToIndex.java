//Given an array of elements of length n, ranging from 0 to n - 1. All elements may not be present in the array.
//        If the element is not present then there will be -1 present in the array. Rearrange the array such that
//        arr[i] = i and if i is not present, store -1 at that place.
//
//        Examples:
//
//        Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
//        Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
//        Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of them.
package Array;

import java.util.Scanner;

public class RearrangeArrayWithRespectToIndex {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] resultArray = ArrangeWithIndex(array, size);
        for(int result : resultArray){
            System.out.print(result+" ");
        }
    }

    public static int[] ArrangeWithIndex(int[] array , int size){

        int[] newArray = new int[array.length];

        for(int i=0;i<size;i++){
            boolean condition = false;
            for(int j=0;j<array.length;j++){
                if(array[j]==i){
                    newArray[i]=array[j];
                    condition = true;
                }
            }
            if(!condition){
                newArray[i]=-1;
            }
        }
        return newArray;

    }
}
