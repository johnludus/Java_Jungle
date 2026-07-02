//Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.
//
//
//
//        Example 1:
//
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//
//Input: nums = [1]
//Output: [1]
//Example 3:
//
//Input: nums = [1,2]
//Output: [1,2]
package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class MajorityElementIIBruteForce {
    static ArrayList<Integer> MajorityElement(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int check = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                check++;
            }
        }
        if(check==n){
            list.add(0);
            return list;
        }
        if(n==1){
            list.add(nums[0]);
            return list;
        }
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(nums[j]==nums[i]){
                    count++;

                }

            }
            if(count>n/3){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }

            }
        }
        return list;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter every elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> result = new ArrayList<>();
        result = MajorityElement(nums);
        for(int res : result){
            System.out.print(res+" ");
        }
    }
}
