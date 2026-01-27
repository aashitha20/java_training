//to print square * pattern from the rows entered by user
package javatraining;
import java.util.Scanner;
public class pat1 {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
