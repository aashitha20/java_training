//to print a pattern like below
/*  *
    *
* * # * *
    * 
    *
*/
package javatraining;
import java.util.Scanner;
public class pat4 {
    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter even number for rows: ");
        rows = sc.nextInt();
        for(int i = 1; i<= rows; i++){
            for(int j=1; j<= rows; j++){
                if(j == ((rows+1)/2) && i == ((rows+1)/2)){
                    System.out.print("# ");
                }
                else if(j == ((rows+1)/2) || i == ((rows+1)/2)){
                    System.out.print("* ");
                }
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
