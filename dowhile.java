import java.util.Scanner;
public class dowhile {
    public static void main(String[] args) {
        char i;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("WELCOME! to do while loop example"); 
            System.out.println(" Press 'y' or 'Y' to continue, any other key to exit ");
            i = sc.next().charAt(0);
        }while(i =='y' || i == 'Y');


    }
}
