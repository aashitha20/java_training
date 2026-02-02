//to print butterfly pattern
// *       *
// **     **
// ***   ***
// **** ****
// *********
// **** ****
// ***   ***
// **     **
// *       *
package day6;
import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
        int n,i,j; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        n = sc.nextInt();
        //using multiple loops
        //upper half
        // for (int i = 1; i <= n; i++) {  
        //     //left wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for (int j = 1; j <= 2*(n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     //right wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //lower half
        // for (int i = n-1; i >= 1; i--) {  
        //     //left wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for (int j = 1; j <= 2*(n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     //right wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //using one outer loop & one inner loop for entire pattern
        for (i = 1; i <= 2*n - 1; i++) {
            for (j = 1; j <=2*n-1  ; j++) {
                if((i>=j && i<=n ) || (i+j>=2*n && i<=n) || (i<=j && i>=n) || (i+j<=2*n && i>=n)) 
                    {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            } System.out.println();
        }
    }   
}
