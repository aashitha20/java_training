//to check strong number 
import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        int n, sum = 0, r, fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        n = sc.nextInt();
        int temp = n;
        while (n > 0) {
            r = n % 10;
            fact = 1;
            for (int i = 1; i <= r; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a strong number");
        } else {
            System.out.println(temp + " is not a strong number");
        }
    }
}