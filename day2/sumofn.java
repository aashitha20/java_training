// to calculate sum of n natural numbers
package javatraining;
import java.util.Scanner;
public class sumofn {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(" Sum of first "+n+" natural numbers is: "+sum);
    }
}