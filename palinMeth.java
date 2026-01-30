//to calculate whether a number is palindrome not using method with return type boolean
package javatraining;
import java.util.Scanner;   
public class palinMeth {
    public static boolean palindrome(int n) {
        int original = n;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        boolean isPalindrome = palindrome(n);
        if(isPalindrome){
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is NOT a palindrome");
        }

    }
}
