package Array;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWithinKDistanceHashMap {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static boolean DuplicateWithinK(int [] array , int size , int k){
        for (int i=0;i<size;i++){
            if(map.containsKey(array[i]) && (i-map.get(array[i])<=k)){
                return true;
            }
            else{
                map.put(i,array[i]);
            }
        }
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.print("Enter the array elememts : ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the distance to check : ");
        int k = sc.nextInt();
        boolean result = DuplicateWithinK(array , size ,k);
        System.out.println("Duplicate within distance K is : "+result);
    }
}
