//to check whether a number is happy number or not using method
import java.util.Scanner;   
public class happynum {
    public static int isHappy(int n) {
        int sum = 0, r;
        while (n > 0) {
            r = n % 10;
            sum += r * r;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. ");
        n = sc.nextInt();
        int result = n;
        while (result != 1 && result != 4) {
            result = isHappy(result);
        }
        if (result == 1) {
            System.out.println(n + " is a happy number");
        } else {
            System.out.println(n + " is not a happy number");
        }
    }
}
