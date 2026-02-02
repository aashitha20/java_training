//to find sum of odd numbers in given array
package day6;

import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        int [] a = new int [5];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        //to find sum of odd numbers
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                sum+=a[i];
            }
        }   
        System.out.println("sum of odd numbers is: "+sum);
    }
}
