package Math;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The greatest number is : "+((a>b)?(a>c?a:c):(b>c?b:c)));

    }

}
