//to print numbers between start and end values inclusive. 
package javatraining;
import java.util.Scanner;
public class print {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end values: ");
        start = sc.nextInt();
        end = sc.nextInt();
        System.out.println("The numbers between " + start + " and " + end + " are:");
        for(int i=start; i<=end; i++){
            System.out.print(i);
            System.out.println("");
        }
    }
}
