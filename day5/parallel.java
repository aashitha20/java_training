//to print parallel vertical lines
// enter rows: 
// 5
// * * * * *        
//
//
//
// * * * * * 
import java.util.Scanner;
public class parallel {
    public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n ) { //if (j == 1 || j == n)
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
