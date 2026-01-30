//to calculate distance and speed using non-static method
package javatraining;
import java.util.Scanner;
public class nonstatic {
    public double dist(double s, double t){
        return s * t;
    }
    public double speed(double d, double t){
        return d / t;
    }
    public static void main(String[] args) {
        double s, t, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed (in km/h): ");
        s = sc.nextDouble();
        System.out.print("Enter time (in hours): ");
        t = sc.nextDouble();

        d = BookD.dist(s, t);
        System.out.println("Distance traveled: " + d + " km");

        System.out.print("Enter distance (in km): ");
        d = sc.nextDouble();
        System.out.print("Enter time (in hours): ");
        t = sc.nextDouble();

        s = BookD.speed(d, t);
        System.out.println("Speed: " + s + " km/h");
    }

}
