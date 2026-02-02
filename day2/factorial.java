package javatraining;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        n= sc.nextInt();

        //usinf for loop
        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        
        //using while loop
        while( n>0 ){
            fact=fact*n;
            n--;
        }
        System.out.println("factorial is: "+fact);
    }
}
