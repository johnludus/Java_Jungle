//Given a binary string s, the task is to count all substrings that start and end with
//        the character '1'. A valid substring must have both its first and last characters as '1',
//        and can include one or more number of characters in between.
//
//        Examples:
//
//        Input: s = "00100101"
//        Output: 3
//        Explanation: Valid substrings are "1001", "100101", and "101",
//        all starting and ending with '1'.


package String;
import java.util.Scanner;
public class BinarySubStringWithCornersAs1 {
    static int countSubString(String str){
        int count = 0;
        // Count of '1's using loop
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        // Return total substrings = m * (m - 1) / 2
        return count*(count-1)/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary string : ");
        String str = sc.next();
        int totalSubString = countSubString(str);
        System.out.println("The total number of substring with corner's 1 is : "+totalSubString);

    }

}
