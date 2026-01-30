//to find area of circle using parameterized method & no argument method
package javatraining;
import java.util.Scanner;
public class areacircle {
    //parameterized method
    static void area(double r){
        double area = 3.14 * r * r;
        System.out.println("Area of circle with radius " + r + " is: " + area);
    }

    //no argument method
    static void area(){
        double r = 5.0; //default radius
        double area = 3.14 * r * r;
        System.out.println("Area of circle with default radius " + r + " is: " + area);
    }
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        r = sc.nextDouble();

        //calling parameterized method
        area(r);

        //calling no argument method
        area();
    }
}
