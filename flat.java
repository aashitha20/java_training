package javatraining;

import java.util.Scanner;

public class flat {
    public static void main(String[] args) {
        int age, amt, bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:  ");
        age = sc.nextInt();
        System.out.println("enter bill amount:  ");
        amt = sc.nextInt();
        if(age>=13 && age<=19){
            bill = amt - (amt*5/100);
            if(bill>=5000){
                bill = bill - (bill*5/100);
            }
            System.out.println("discounted bill amount for Teens : "+bill);
        }
        else if(age>20 && age<=29){
            bill = amt - (amt*6/100);
            if(bill>=6000){
                bill = bill - (bill*6/100);
            }
            System.out.println("discounted bill amount for Youngsters : "+bill);
        }
        else if(age>29){
            bill = amt - (amt*7/100);
            if(bill>=7000){
                bill = bill - (bill*7/100);
            }
            System.out.println("discounted bill amount for Adults : "+bill);
        }
        else{
            System.out.println("no discount applicable");
        }
    }
}
