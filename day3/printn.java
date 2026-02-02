//to print from n to 1
package javatraining;
import java.util.Scanner;
public class printn {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println("The numbers are:");
        for(int i=n; i>=1; i--){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
