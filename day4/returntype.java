//to calculate area & perimeter of rectangle using return type method
package javatraining;
import java.util.Scanner;
public class returntype {
    public static double area(double l, double b){
        return l * b;
    }
    public static double peri(double l, double b){
        return 2 * (l + b);
    }
    public static void main(String[] args) {
        double l, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        b = sc.nextDouble();
        double area = area(l, b);
        double perimeter = peri(l, b);
        System.out.println("Area of rectangle is: " + area(l, b));
        System.out.println("Perimeter of rectangle is: " + peri(l, b));
    }
}
