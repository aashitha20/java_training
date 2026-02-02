//to find transpose of a matrix
package day7;
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        int [][] a = new int [2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //print transpose matrix
        System.out.println("transpose matrix is: ");
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i]+"  ");
            }
            System.out.println();
        }

    }
}
