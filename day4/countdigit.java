//program to count number of digits in a number
package javatraining;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        int n, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: "); 
        n= sc.nextInt(); 
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("number of digits: " + count);
    }
}