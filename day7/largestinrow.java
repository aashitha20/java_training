//to print largest element in each row of a matrix
package day7;
import java.util.Scanner;
public class largestinrow {
    public static void main(String[] args) {
        int [][] a = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //print largest in each row
        System.out.println("largest elements in each row: ");
        for(int i=0;i<a.length;i++){
            int max = a[i][0];
            for(int j=1;j<a[i].length;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
            System.out.println("row "+(i+1)+": "+max);
        }
    }
}
