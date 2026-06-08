//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//Example 1:
//Input: nums = [1,2,3,1], k = 3
// /Output: true
// /Example 2:
// /
// /Input: nums = [1,0,1,1], k = 1
// /Output: true
// /Example 3:
// /
// /Input: nums = [1,2,3,1,2,3], k = 2
// /Output: false
//
//
//
//

package Leetcode;
import java.util.HashMap;
import java.util.Scanner;


public class ContainsDuplicateTwoHashMap {
    public static boolean ContainsDuplicate(int[] array , int size , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(map.containsKey(array[i])){
                if((i-map.get(array[i]))<=k){
                    return true;
                }
            }

            map.put(array[i],i);

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sn array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the size of an array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int k = sc.nextInt();
        boolean check = ContainsDuplicate(array , size , k);
        System.out.println("Duplicate element in distance k : "+check);
    }
}
