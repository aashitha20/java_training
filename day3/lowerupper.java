//to check whether a character is lower case or upper case
package javatraining;
import java.util.Scanner;
public class lowerupper {
    public static void main(String [] args){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character: ");
        ch = sc.next().charAt(0);
        // using if else
        if(ch>='a' && ch<='z'){
            System.out.println(ch + " is lower case");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println(ch + " is upper case");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
