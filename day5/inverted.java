//left inverted pattern
// ****
// ***
// **
// *
import java.util.Scanner;
public class inverted {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                //right inverted triangle
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                //left inverted triangle
                // if (j <= n - i + 1) {
                //     System.out.print("* ");
                // } else {
                //     System.out.print("  ");
                // }
            }
            System.out.println();
        }
    }
}
