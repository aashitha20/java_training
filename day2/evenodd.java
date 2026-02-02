// to check whether a number is even or odd
package javatraining;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: "); 
        n= sc.nextInt(); 
        // evenodd using if else    
    //     if(n%2==0){
    //         System.out.println("n is even ");
    //     }
    //     else{
    //         System.out.println("n is odd ");
    //     }
    // }

    evenodd using switch
        switch(n%2){
            case 0:
                System.out.println("n is even ");
                break;
            case 1:
                System.out.println("n is odd ");
                break;
            default:
                System.out.println("invalid input");
        }
        }

        switch (isPrime) {
            case true:
                System.out.println(n + " is prime");
                break;
            case false:
                System.out.println(n + " is NOT prime");
                break;
        }
    }
}
