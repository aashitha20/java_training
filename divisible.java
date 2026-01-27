//to check whether a number is divisible by 5 and 11
package javatraining;
import java.util.Scanner;
public class divisible {
    public  static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        // using if else
        if(n%5==0 && n%11==0){
            System.out.println(n + " is divisible by 5 and 11");
        }
        else{
            System.out.println(n + " is not divisible by 5 and 11");
        }

        //using ternary operator
        String result = (n%5==0 && n%11==0) ? (n + " is divisible by 5 and 11") : (n + " is not divisible by 5 and 11");
        System.out.println(result);
    }
}
