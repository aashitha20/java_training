//  to calculate sum of even numbers till give number starting from 0 
package javatraining;
import java.util.Scanner;
public class sumofeven {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        // using do while loop
        do{
            if(n%2==0){
                sum = sum + n;
            }
            n--;
        }while(n>=0);
        System.out.println("Sum of even numbers " + sum);
    }
}
