//to replace every element with its sum of digits in an array 
package day7;
import  java.util.Scanner;
public class replacesum {
    public static void main(String[] args) {
        int [] a = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        //replace each element with sum of its digits
        for(int i=0;i<a.length;i++){
            int num = a[i];
            int sum =0;
            while(num>0){
                int digit = num%10;
                sum+=digit;
                num=num/10;
            }
            a[i]=sum;
        }
        //print modified array
        System.out.println("modified array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
