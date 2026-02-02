//to reverse an array 
package day7;
import java.util.Scanner;
public class reversearr {
    public static void main(String[] args) {
        int [] a = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        //to print reversed array directly
        // System.out.println("reversed array is: ");
        // for(int i=a.length-1;i>=0;i--){
        //     System.out.print(a[i]+" ");
        // }

        //or to store reversed array in another array
        // int [] b = new int [5];
        // for(int i=0,j=a.length-1;i<a.length;i++,j--){
        //     b[i]=a[j];
        // }   
        // System.out.println("\nreversed array stored in another array: ");
        // for(int i=0;i<b.length;i++){
        //     System.out.print(b[i]+" ");
        // }

        //to reverse array in the same array
        // for(int i=0,j=a.length-1;i<j;i++,j--){
        //     int temp=a[i];
        //     a[i]=a[j];
        //     a[j]=temp;
        // }
        // System.out.println("\nreversed array in the same array: ");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }

        //reverse first half of an array 
        // for(int i=0,j=(a.length/2)-1;i<j;i++,j--){
        //     int temp=a[i];
        //     a[i]=a[j];
        //     a[j]=temp;
        // }
        // System.out.println("\nfirst half reversed array: ");
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }

        //to reverse array in even indexes only
        for(

    }    
}
