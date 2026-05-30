package Array;

import java.util.HashSet;
import java.util.Scanner;
                                                        // HashSet
public class RemoveDuplicateElementHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter array element : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int newSize=0;
        for(int i=0;i<size;i++){
            if(!set.contains(array[i])){
                set.add(array[i]);
                array[newSize++]=array[i];


            }
        }
       for(int i=0;i<newSize;i++){
           System.out.print(array[i]+" ");
       }

    }
}
