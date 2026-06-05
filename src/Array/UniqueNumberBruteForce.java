package Array;

import java.util.Scanner;

public class UniqueNumberBruteForce {
    public static int UniqueNum(int[] array , int size){
        int count;
        for(int i=0;i<size;i++){
            count = 0;
            for(int j=i;j<size;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count==1){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int uniqueNumber = UniqueNum(array , size);
        System.out.println("The unique number in the given array : "+ uniqueNumber);
    }
}