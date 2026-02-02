//to find maximum of two numbers
package javatraining;
import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        //using if else
        if(a>b){
            System.out.println(a+" is maximum");
        }
        else{
            System.out.println(b+" is maximum");
        }
    }
}
