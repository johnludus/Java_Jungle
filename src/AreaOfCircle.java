import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = Math.PI*(Math.pow(radius,2));
        System.out.println(area);
    }

}
