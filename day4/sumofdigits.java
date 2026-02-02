//to find sum of digits
package javatraining;
import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no. ");
        n= sc.nextInt();
        while(n>0){
            n%=10;
            sum

        }
        return sum;
        System.out.println(" "+sum);
    }
}
