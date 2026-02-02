//to be print 2D array (matrix)
package day7;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        // 1 2 3 
        // 4 5 6
        // 7 8 9
        // int [][] a = {{1,2,3},{4,5,6},{7,8,9}};   

        //or take input from user
        int [][] a = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //print matrix
        System.out.println("matrix is: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
