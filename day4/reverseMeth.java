//to calculate whether a number is prime or not using method with return type boolean
package javatraining;
import java.util.Scanner;
public class reverseMeth {
    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        int reversedNumber = reverse(n);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
