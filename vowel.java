// to check whether a character is vowel or not
package javatraining;
import java.util.Scanner;
public class vowel {
    public static void main(String [] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        // using if else
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is consonant");
        }
    }
}
