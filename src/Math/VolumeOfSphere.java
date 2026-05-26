package Math;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    double volume = (4.0/ 3) * (Math.PI) * Math.pow(radius, 3);
    System.out.println("Volume of a Sphere is : "+volume);
}
}
