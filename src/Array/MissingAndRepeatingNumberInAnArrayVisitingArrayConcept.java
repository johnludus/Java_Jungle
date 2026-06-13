//        Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number
//        in this range is missing, and another number occurs twice in the array, find both the duplicate number
//        and the missing number.
//
//        Examples:
//
//        Input: arr[] = [3, 1, 3]
//        Output: [3, 2]
//        Explanation: 3 is occurs twice and 2 is missing.
//
//        Input: arr[] = [4, 3, 6, 2, 1, 1]
//        Output: [1, 5]
//        Explanation: 1 is occurs twice and 5 is missing.

package Array;


import java.util.ArrayList;
import java.util.Scanner;

public class MissingAndRepeatingNumberInAnArrayVisitingArrayConcept {

    public static ArrayList<Integer> MissingAndRepeating(int[] array , int size){
        ArrayList<Integer> list = new ArrayList<>();
        int missing = -1;
        int repeating = -1;

        int[] checkArray = new int[size+ 1];
        for(int i=0;i<size;i++){
            checkArray[array[i]]++;
        }
        for(int i=1;i<size+1;i++){
            if(checkArray[i]==0){
                missing = i;
            }
            else if(checkArray[i]==2){
                repeating = i;
            }
        }
        list.add(missing);
        list.add(repeating);
        return list;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        ArrayList<Integer> result = MissingAndRepeating(array , size);
        for(int bothNumber : result){
            System.out.print(bothNumber + " ");
        }
    }
}
