//to demonstrate initializer block
package day8;

public class initial {
    public static void main(String [] args){
        int a=6, b=9;
        System.out.println(" "+(a+b));
        System.out.println("Hello");
    }
    static {
        System.out.println("Hiiii");
    }
}