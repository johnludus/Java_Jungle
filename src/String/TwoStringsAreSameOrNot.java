
//Given two strings, check if these two strings are identical(same) or not. Consider case sensitivity.
package String;

import java.util.Scanner;

public class TwoStringsAreSameOrNot {
    public static boolean StringComparision(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean result = StringComparision(s1,s2);
        System.out.println("Both Strings are :"+result);

    }
}
