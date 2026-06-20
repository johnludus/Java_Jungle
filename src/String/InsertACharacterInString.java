package String;

import java.util.Scanner;

public class InsertACharacterInString {
    public static String InsertedArray(String s , char ch , int pos){
        String result = s.substring(0,pos)+ch+s.substring(pos);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Enter the character to insert : ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the position to insert :");
        int pos = sc.nextInt();
        String newString = InsertedArray(s,ch,pos);
        System.out.println(newString);



    }
}
