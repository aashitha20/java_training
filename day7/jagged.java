//to print jagged array
package day7;
import java.util.Scanner;
public class jagged {
    public static void main(String[] args) {
        //printing jagged array
        //int [][] a = {{1,2,3},{4},{5,6,7,8,9}};   
        // System.out.println("jagged array is: ");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //or take input from user
        // int [][] a = new int [3][];
        // a[0]=new int[3];
        // a[1]=new int[1];
        // a[2]=new int[5];
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter elements: ");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }

        //jagged array with user defined sizes
        int [][] a = new int [3][];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("enter size of row "+(i+1)+": ");
            int size = sc.nextInt();
            a[i]=new int[size];
        }
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }  
        //print jagged array
        System.out.println("jagged array is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
         
    }
}
