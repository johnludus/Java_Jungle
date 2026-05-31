 /* // Reduce the array to one element by repeatedly removing the larger
// element from a chosen pair. The cost of each operation is the smaller
// element in that pair. Find the minimum total cost required.*/

 package Array;


 import java.util.Scanner;

 public class MinCostToMakeArraySizeOne {
     public static int MinCost(int[] array,int size){
         int min = array[0];
         for(int i=0;i<size;i++){
             if(min>array[i]){
                 min = array[i];
             }
         }
         return (min)*(size-1);
     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Array elements : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int minCost = MinCost(array,size);
        System.out.println("The minimum cost of an array is : "+minCost);


    }
}
