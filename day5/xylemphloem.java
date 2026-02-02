
import java.util.Scanner;

//to be implemented xylem phloem number 
//1234 = 1+4=5 and (2+3)=5 = xylem number 
//56178 = (5+8)=13 and (6+7+1)=14 = phloem number
public class xylemphloem {
    public static void main(String[] args) {
        int n, sum1, sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sum1 = n%10;
        n = n/10;
        while(n>9){
            sum2 =n%10;
            n = n/10;
        }
        if(sum1==sum2){
            System.out.println("Xylem number");
        }
        else{
            System.out.println("Phloem number");
        }
    }
}