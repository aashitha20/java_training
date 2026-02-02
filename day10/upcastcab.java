//display upcast with cab example by taking option from user, and using switch 

import java.util.Scanner;

public class upcastcab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Cab Type: 1. non-ac 2. ac 3. lux");
        int choice = sc.nextInt();
        Cab c= null;
        switch(choice){
            case 1:
                c = new nonac(); //upcasting
                c.bookCab();
                break;
            case 2:
                c = new ac(); //upcasting
                c.bookCab();
                break;
            case 3:
                c = new lux(); //upcasting
                c.bookCab();
                break;
            default:
                System.out.println("Invalid option");
        }
        if (c instanceof nonac) {
            nonac nc = (nonac) c; //downcasting
            nc.bookCab();
        } else if (c instanceof ac) {
            ac acCab = (ac) c; //downcasting
            acCab.bookCab();
        } else if (c instanceof lux) {
            lux lx = (lux) c; //downcasting
            lx.bookCab();
        }
    }
}
class Cab{
    public void bookCab(){
        System.out.println("Cab booked");
    }
}
class nonac extends Cab{
    public void bookCab(){
        System.out.println("non-ac Cab booked");
    }
}
class ac extends Cab{
    public void bookCab(){
        System.out.println("AC Cab booked");
    }
}   
class lux extends Cab{
    public void bookCab(){
        System.out.println("luxury Cab booked");
    }
}   