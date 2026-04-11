import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args){
        int speed;
        Scanner sc=new Scanner(System.in);
        speed = sc.nextInt();
        if(speed>60)
            System.out.println("Over Speeding, Pay FIne");
        else
            System.out.println("On speed");


    }

}
