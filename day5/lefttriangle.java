//to print left triangle
// *
// **
// ***
// ****
import java.util.Scanner;
public class lefttriangle {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
