package Array;
import java.util.Scanner;
import java.util.ArrayList;

public class SupressorCount {
    static ArrayList<Integer> SupressorArray(int[] array, int size){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            int count = 0;
            for(int j=i+1;j<size;j++){
                if(array[i]<array[j]){
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length :");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<len;i++){
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> resArray = SupressorArray(array , len);
        for(int result : resArray){
            System.out.println(result);
        }
    }

}
