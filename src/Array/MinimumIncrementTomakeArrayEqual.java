package Array;

import java.util.Scanner;

public class MinimumIncrementTomakeArrayEqual {
    public static int ArrayEqual(int []array,int n,int k){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(array[i]>max){                // To find maximum element.
                max = array[i];
            }
        }
        int res = 0;
        for (int i=0;i<n;i++){
            if((max-array[i])%k!=0){         // To check is it possible to reach maximum element.
                return -1;
            }
            res+=(max-array[i])/k;           // How much increment is needed for each element to reach maximum.

        }
        return res;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements : ");
        for (int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the incrementing value : ");
        int k = sc.nextInt();

        int res = ArrayEqual(array,n,k);
        System.out.println("Minimum increment required to make array equal : "+res);
    }
}
