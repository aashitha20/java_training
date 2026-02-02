//to calculate gross salary based on basic salary and years of service
//basic salary <= 10000 :  hra(20%) + da(80%)
//basic salary <= 20000 : hra(25%) + da(90%)
//basic salary > 20000 : hra(30%) + da(95%)
//if years of service > 3 years : bonus 2500
package javatraining;
import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        int cyr, jyr, tyr; //current year, joining year, total years of service
        float basic, gross; // basic salary, gross salary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basic = sc.nextFloat(); 
        System.out.print("Enter joining year: ");
        jyr = sc.nextInt();
        System.out.print("Enter current year: ");
        cyr = sc.nextInt();
        tyr = cyr - jyr; // calculating total years of service
        // calculating gross salary based on basic salary slabs
        if(basic <= 10000){
            gross = basic + (0.20f * basic) + (0.80f * basic);
        }
        else if(basic <= 20000){
            gross = basic + (0.25f * basic) + (0.90f * basic);
        }
        else{
            gross = basic + (0.30f * basic) + (0.95f * basic);
        }   
        //rs 25000 bonus for more than 3 years of service
        if(tyr>3){
            gross += 2500;
        }
        System.out.println("Gross Salary: " + gross);
    }
}
