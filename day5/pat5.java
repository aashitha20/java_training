import java.util.Scanner;
//to print pattern [
public class pat5 {
        public static void main(String[] args) {
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j ==1 || j == n) { // if(i == 1 || i == n || j ==1) for reverse [ 
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}