//to calculate whether a number is prime or not using method with return type boolean
package javatraining;
import java.util.Scanner;
public class primeMeth {
    public static boolean prime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        boolean isPrime = prime(n);
        if(isPrime){
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is NOT prime");
        }

    }
}