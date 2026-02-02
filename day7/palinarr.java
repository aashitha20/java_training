//tp check if array is palindrome
package day7;
import java.util.Scanner;   
public class palinarr {
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        boolean ispalin = true;
        for(int i=0,j=a.length-1;i<j;i++,j--){
            if(a[i]!=a[j]){
                ispalin = false;
                break;
            }
        }
        if(ispalin){
            System.out.println("array is palindrome");
        }else{
            System.out.println("array is not palindrome");
        }

    }
}
