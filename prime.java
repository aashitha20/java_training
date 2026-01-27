//  to check whether a number is prime or not
package javatraining;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        

        //using for loop
        for( int i=2; i<n; i++) {
            if(n%i==0){
                System.out.println(n + " is NOT prime");
                return;
            }
            else{
                System.out.println(n + " is prime");
                return;
            }
        }
    }
}
