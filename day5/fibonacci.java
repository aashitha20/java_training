//to print fibonacci series using method

import java.util.Scanner;

public class fibonacci {
    static void fibonacci(int n){
        int f0=0, f1=1, f2=0;
        System.out.print(" " +f0+" "+f1);
        for(int i=2; i<n; i++){
        f2 = f0 + f1;

        System.out.print(" "+f2);
        f0=f1;
        f1=f2;
        }
    }
    public static void main(String[] args) {
        int n,f0,f2=0,f1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n: ");
        n=sc.nextInt();
        if(n==0){
            System.out.println("0");
        }
        else if(n==1){
            System.out.println("1");
        }
        else{
        fibonacci(n);
        }
    }
}
