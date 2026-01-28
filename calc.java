//to create calculator using parametarized method 
package javatraining;
import java.util.Scanner;
public class calc {
    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }   
    public static void sub(int a, int b){
        int diff = a - b;
        System.out.println("Difference: " + diff);
    }
    public static void mul(int a, int b){
        int prod = a * b;
        System.out.println("Product: " + prod);
    }
    public static void div(int a, int b){
        if(b != 0){
            double quo = (double)a / b;
            System.out.println("Quotient: " + quo);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }
}
