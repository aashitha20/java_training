//neon number
package day6;

import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("enter a no. ");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int sqr=n*n;
        while(sqr>0){
            sum+=sqr%10;
            sqr/=10;
        }
        if(sum==n){
            System.out.println("neon number");
        }
        else{
            System.out.println("not neon number");
        }
    }
}
