package Array;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DuplicateWithinKDistanceBruteForce {
    public static boolean FindDuplicate(int [] array , int size,int k){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i] == array[j] && (j-i)<=k){
                    return true;
                }
            }

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter thr distance to check : ");
        int k = sc.nextInt();

        boolean result = FindDuplicate(array,size,k);
        System.out.println("Duplicate is : "+result);

    }
}
