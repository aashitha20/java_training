//program to show method overloading based 
package javatraining;

public class methodover {
    public static int add(int a, int b){
        return a + b;
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(5, 10));
        System.out.println("Sum of two doubles: " + add(5.5, 10.2));
        System.out.println("Concatenation of two strings: " + add("Hello, ", "World!"));
    }   
    
}
