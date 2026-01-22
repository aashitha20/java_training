import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age: ");
    age= sc.nextInt();
    if(age>=18){
        System.out.println("person is eligible to vote");
    }
    else{
        System.out.println("person is NOT eligible");
    }
    
    }
}
