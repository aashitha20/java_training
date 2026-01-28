//to check if number is amstrong number or not
package javatraining;
import java.util.Scanner;
public class amstrong {
    static int amstrong(int n){
        int sum = 0, r, temp;
        temp = n;
        while(n>0){
            r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }
        if(temp == sum){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: "); 
        n= sc.nextInt(); 
        if(amstrong(n)==1){
            System.out.println(n + " is an amstrong number");
        }
        else{
            System.out.println(n + " is NOT an amstrong number");
        } 
    }
}
