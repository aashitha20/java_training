//to print left triangle pattern
//    *
//   **
//  ***
//   **
//    *
package day6;

import java.util.Scanner;

public class lefttriangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: "); 
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //System.out.println();
        
            //
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //System.out.println();
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
