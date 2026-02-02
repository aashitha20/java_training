//to check whether a number is automorphic or not
package javatraining;
import java.util.Scanner;
public class automorphic {
    static int automorphic(int n){
        int sq = n * n;
        while(n>0){
            if(n%10 != sq%10){
                return 0;
            }
            n = n/10;
            sq = sq/10;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: "); 
        n= sc.nextInt(); 
        if(automorphic(n)==1){
            System.out.println(n + " is an automorphic number");
        }
        else{
            System.out.println(n + " is NOT an automorphic number");
        } 
    }
}
