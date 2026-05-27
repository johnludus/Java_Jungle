package Array;

import java.util.Scanner;

public class ReverseArrayFixedSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("Enter a size which need to be reversed : ");
        int k = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        int len = array.length;
        for (int i = 0; i < k/2; i++) {
            int temp = array[i];
            array[i] = array[k - i - 1];
            array[k - i - 1] = temp;
        }
        System.out.print("Reversed array : ");
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
