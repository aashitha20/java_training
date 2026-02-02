//to count number of notes for a given amount
package javatraining;
import java.util.Scanner;
public class note {
    public static void main(String[] args) {
        int amt, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount: ");
        amt= sc.nextInt();

        if (amt>=500){
            count += amt/500;
            amt %= 500;

            count += amt/200;
            amt %= 200;

            count += amt/100;
            amt %= 100;

            count += amt/50;
            amt %= 50;

            count += amt/20;
            amt %= 20;

            count += amt/10;
            amt %= 10;

            count += amt/5;
            amt %= 5;

            count += amt/2;
            amt %= 2;

            count += amt/1;
            amt %= 1;

        }

        else{
            System.out.println("amount should be atleast 500");
        }
        System.out.println("total number of notes: "+count);
    }
}