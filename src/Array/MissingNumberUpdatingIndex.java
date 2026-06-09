//Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
//        This array represents a permutation of the
//        integers from 1 to n with one element missing.
//        Find the missing element in the array.
//        Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//        Output: 6
//        Explanation: All the numbes from 1 to 8 are present except 6.

package Array;

import java.util.Scanner;

public class MissingNumberUpdatingIndex {
    public static int MissingNumber(int[] array , int size) {
        int[] save = new int[array.length + 1];
        for (int i = 0; i < save.length; i++) {
            save[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            save[array[i] - 1]++;
        }
        for (int i = 0; i < save.length; i++) {
            if (save[i] == 0) {
                return i+1;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of sn array : ");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Enter the size of an array : ");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            int missingNumber = MissingNumber(array , size);
            System.out.println("The profit from the given array is : "+missingNumber);
        }

}
