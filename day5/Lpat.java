// *
// *
// *
// *
// * * * * *     
//--- IGNORE ---
// * * * * * 
//         *
//         *
//         *
//         *
import java.util.Scanner;

//to print L pattern
public class Lpat {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");  
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n || i == 1) { //if (j == n || i == n) for reverse L
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
