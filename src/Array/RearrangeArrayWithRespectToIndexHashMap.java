package Array;

import java.util.HashSet;
import java.util.Scanner;

public class RearrangeArrayWithRespectToIndexHashMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int[] resultArray = RearrangeWithIndex(array);
        System.out.print("The Rearranged rray is : ");
        for(int result : resultArray){
            System.out.print(result+" ");
        }
    }

    public static int[] RearrangeWithIndex(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<array.length;i++){
            set.add(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(!set.contains(i)){
                array[i]=-1;
            }
            else {
                array[i]=i;
            }
        }
        return array;

        }


    }

