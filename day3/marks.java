//to input marks of 5 subjects and calculate total, average and percentage
package javatraining;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        int p,c,m,cs,b;
        int total;
        float percent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 5 subjects: ");
        p = sc.nextInt();
        c = sc.nextInt();
        m = sc.nextInt();
        cs = sc.nextInt();
        b = sc.nextInt();
        //to check non-negative marks
        if(p<0 || c<0 || m<0 || cs<0 || b<0){
            System.out.println("Marks cannot be negative");
            return;
        }
        // calculating total
        total = p + c + m + cs + b;
        // calculating percentage
        percent = (total / 500.0f) * 100;
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percent + "%");
        //grade calculation
        if(percent >= 90){
            System.out.println("Grade: A");
        }
        else if(percent >= 80){
            System.out.println("Grade: B");
        }
        else if(percent >= 70){
            System.out.println("Grade: C");
        }
        else if(percent >= 60){
            System.out.println("Grade: D");
        }
        else if(percent >= 40){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
