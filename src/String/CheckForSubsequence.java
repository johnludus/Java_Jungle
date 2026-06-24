//Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not.
//        Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without
//        changing the order of the remaining elements.
//
//        Examples:
//
//        Input: s1 = "AXY", s2 = "YADXCP"
//        Output: false
//        Explanation: s1 is not a subsequence of s2 as 'Y' appears before 'A'.
//        Input: s1 = "gksrek", s2 = "geeksforgeeks"
//        Output: true
//        Explanation: If we combine the bold character of "geeksforgeeks", it equals to s1. So s1 is a subsequence of s2.
package String;

import java.util.Scanner;

public class CheckForSubsequence {
    static boolean Check(String s1 , String s2){
        int j=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)==s1.charAt(j)){
                j++;
            }
            if(j==s1.length()){
                return true;
            }

        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string s1 : ");
        String s1 = sc.next();
        System.out.println("Enter the string s2 : ");
        String s2 = sc.next();
        boolean result = Check(s1,s2);
    }

}
