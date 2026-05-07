import java.util.Scanner;

public class consonantOrVowel {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        String check ;
        switch (ch) {
            case 'a':
                check = "vowels";
            case 'e':
                check = "vowels";
            case 'i':
                check = "vowels";
            case 'o':
                check = "vowels";
            case 'u':
                check = "vowels";
                break;
            default:
                check = "consonant";

        }
        System.out.println("The character is:"+check);
    }
}
