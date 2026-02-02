//to print a pattern like below
/* 1 2 3 4 5 
   6 7 8 9 10
   11 12 13 14 15
    16 17 18 19 20
*/
package javatraining;
import java.util.Scanner;
public class pat2 {
    public static void main(String[] args) {
        int rows, num=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        //aligned pattern printing
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                System.out.printf("%4d", num);
                num++;
            }
            System.out.println(" ");
        }
    }
}
