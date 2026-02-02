package day6;
import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=1;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("elements are: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }   
        // arr[0]=10;
        // arr[1]=20;
        // arr[2]='a';
        // System.out.println(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }



    }
}
