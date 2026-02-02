//to print prime numbers between 1 to n using arrays
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("prime numbers are: ");
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(a[i]+" ");
            }
        }
    }    
}