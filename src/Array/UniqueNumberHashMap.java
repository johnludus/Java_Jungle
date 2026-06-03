package Array;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueNumberHashMap {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static int UniqueNumber(int[] array , int size){
        for(int i=0;i<size;i++){
            if(map.get(array[i])==1){
                return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }
        }
        int uniqueNumber = UniqueNumber(array , size);
        System.out.println("The unique number in the array is : "+uniqueNumber);

    }

}
