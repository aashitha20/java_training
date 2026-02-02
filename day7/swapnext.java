//to swap digit with it's next digit in an array
package day7;
import java.util.Scanner;
public class swapnext {
    public static void main(String[] args) {
        int [] a = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        //take index value from user 
        System.out.println("enter index : ");
        int idx = sc.nextInt();
        //swap element at index with next index
        if(idx>=0 && idx<a.length-1){
            int temp = a[idx];
            a[idx]=a[idx+1];
            a[idx+1]=temp;
        } else {
            System.out.println("invalid");
        }
        //print the next value 
        System.out.println("modified array is: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }   
        
    }
}