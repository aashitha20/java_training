//to print a pattern like below
/* A 3 4 5 6 
   3 B 5 6 7 
   4 5 C 6 7 
   5 6 7 D 9
   6 7 8 9 E
*/
package javatraining;
import java.util.Scanner;
public class pat3 {
    public static void main(String[] args) {
        int rows;
        int ch= 65;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        //aligned pattern printing
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(i==j){
                    System.out.printf("%4c", (char)ch++);
                }
                else{
                    System.out.printf("%4d", i + j );
                }
            }
            System.out.println(" ");
        }
    }
}
