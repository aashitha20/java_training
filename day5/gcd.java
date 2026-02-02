//gcd and lcm of two nos.
import java.util.Scanner;

public class gcd {
    static int gcdcalc(int a, int b){
        if(b==0){
            System.out.println(" "+a);
            return a;
        }
        return gcdcalc(b,a%b);
    }
    static int lcm(int a, int b){
        int lcm = a>b? a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm++;
        }
    }
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter two nos. : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("GCD is : "+gcdcalc(a,b));
        System.out.println("LCM is : "+lcm(a,b));

    }
}
