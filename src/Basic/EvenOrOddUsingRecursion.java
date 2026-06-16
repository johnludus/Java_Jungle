package Basic;

import java.util.Scanner;

public class EvenOrOddUsingRecursion{
    public static String EvenOrOdd(int n){
        if(n==1){
            return "The number is ODD";

        }
        else if (n==0)
            return "The number is EVEN";
        return EvenOrOdd(n-2);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = EvenOrOdd(num);
        System.out.println(result);
    }
}
