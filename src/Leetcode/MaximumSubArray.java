package Leetcode;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.StrictMath.max;

public class MaximumSubArray {
    public static void main(String[] args){
        int [] array = {-2,13,5,-7,12,8,-10,7};
        int sum=0;
        int maxSum=MIN_VALUE;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            maxSum=max(sum,maxSum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Sum of Maximum SubArray : "+maxSum);
    }
}
