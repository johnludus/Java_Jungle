package Math;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        double  power = Math.pow(num1,num2);
        System.out.println(power);


    }

}
