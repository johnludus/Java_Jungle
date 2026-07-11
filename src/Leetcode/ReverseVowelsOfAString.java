//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//Example 1:
//
//Input: s = "IceCreAm"
//
//Output: "AceCreIm"
//
//Explanation:
//
//The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
//
//Example 2:
//
//Input: s = "leetcode"
//
//Output: "leotcede"
package Leetcode;

import java.util.Scanner;

public class ReverseVowelsOfAString {
    static String VowelsReversed(String s){
        char[] arr = s.toCharArray();
        int n = s.length();
        int first = 0;
        int last = n-1;
        boolean front = true;
        boolean back  = true;
        while(first<last){
            Character ch1 = arr[first];
            Character ch2 = arr[last];
            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ||ch1 == 'A' ||ch1 == 'E'||ch1 == 'O' || ch1 == 'U' || ch1 == 'I' ){
                front = false;

            }
            if(  ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' ||ch2 == 'A' ||ch2 == 'E'||ch2 == 'O' || ch2 == 'U' || ch2 == 'I'){
                back = false;
            }
            if(!front && !back){
                Character temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                front = true;
                back = true;
                first++;
                last--;
            }
            else if(front){
                first++;
            }
            else if(back){
                last--;
            }



        }
        return new String(arr);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        String result = VowelsReversed(str);
        System.out.print(result);
    }
}
