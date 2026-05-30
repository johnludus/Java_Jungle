package Array;
import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array element : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int newSize = 0;
        for (int i=0;i<size-1;i++){
            if(array[i]!=array[i+1]){
                array[newSize++] = array[i];

            }
        }
        array[newSize++] = array[size-1];
        for (int i=0;i<newSize;i++){
            System.out.print(array[i]+" ");
        }
    }
}
