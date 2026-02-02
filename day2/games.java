package javatraining;

import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        day = sc.nextLine();

        switch (day) {

            case "monday":
            case "Monday":
                System.out.println("Basketball");
                break;
            case "tuesday":
            case "Tuesday":
            case "thursday":
            case "Thursday":
                System.out.println("Volleyball");
                break;
            case "wednesday":
            case "Wednesday":
            case "saturday":
            case "Saturday":
                System.out.println("Cricket");
                break;
            case "friday":
            case "Friday":
                System.out.println("Kabbadi");
                break;
            case "sunday":
            case "Sunday":
                System.out.println("Rest Day");
                break;
            default:
                System.out.println("Invalid day entered");
        }
        
    }
}
