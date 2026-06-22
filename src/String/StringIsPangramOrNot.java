package String;

import java.util.Scanner;

public class StringIsPangramOrNot {
    static boolean PangramCheck(String str){
        for(char ch = 'a';ch<='z';ch++){
            boolean check = false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    check = true;
                }
            }
            if(!check){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        if(PangramCheck(str)){
            System.out.println("The string is a pangram.");
        }
        else{
            System.out.println("The string is not a pangram.");
        }
    }
}
