//to find largest and second largest number in an array
package day6;

import java.util.Scanner;

public class large {
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }   
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("largest number is: "+a[a.length-1]);
        System.out.println("second largest number is: "+a[a.length-2]);
        
    }
}
