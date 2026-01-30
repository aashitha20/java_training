//program to check whether a number is perfect number or not
package javatraining;
import java.util.Scanner;
public class perfectno {
    //using method with return type boolean
    static int perfect(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        return sum;   
    }

    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: "); 
        n= sc.nextInt(); 
        if(perfect(n)==n){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is NOT a perfect number");
        } 
    }
}
