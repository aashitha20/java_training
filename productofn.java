package javatraining;
import java.util.Scanner;
public class productofn {
    public static void main(String[] args) {
        int n, product=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        n= sc.nextInt();

        //using for loop
        for(int i=1;i<=n;i++){
            product=product*i;
        }
        
        //using while loop
        // while( n>0 ){
        //     product=product*n;
        //     n--;
        // }
        System.out.println("product is: "+product);
    }
}
