//sum of array elements
package day6;
import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        int [] a = new int [5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }   
        System.out.println("sum is: "+sum);
    }   
}
