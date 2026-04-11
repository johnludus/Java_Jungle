import java.util.Scanner;


public class ShoppingCentre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalAmount = sc.nextInt();
        if (totalAmount > 1000) {
            System.out.println(totalAmount =totalAmount-(totalAmount*0.1f));
        }
        else
            System.out.println(totalAmount);

    }

}
