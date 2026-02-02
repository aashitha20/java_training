//smith number
import java.util.Scanner;   
public class smith {
    public static int sod(int i){
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        } return sum;
    }
    public static void main(String[] args) {
        int i=2, n, sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int temp = n;
        while(n>1){
            if(n%i==0){
                sum+= sod(i);
                n/=i;
            }
            else
                i++;
        }
        if (sum == sod(temp)){
            System.out.println("Smith number ");
        }
        else{
            System.out.println("Not a smith number ");
        }
    }
}  