//  to check whether a year is leap year or not
package javatraining;
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = sc.nextInt();
        //using if else
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
