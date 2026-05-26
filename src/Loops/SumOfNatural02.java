package Loops;

public class SumOfNatural02 {
    public static void main(String[] args){
        int nos=1,sum=0,upto=50;
        while(nos<=upto){
            sum+=nos;
            nos++;
        }
        System.out.println(sum);
    }
}
