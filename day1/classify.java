import java.util.Scanner;
public class classify {
    public static void main(String[] args) {
    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age:  ");
    age = sc.nextInt();
    if(age>=0){
        if(age<=12){
            System.out.println("Kids ");
        }
        else if(age>13 && age<=19){
            System.out.println("Teen");
        }
        else if(age>19 && age<=40){
            System.out.println("Mid life");
        }
        else if(age>40){
            System.out.println("Old Peeps");
        }
    }
    else{
        System.out.println("age is invalid ");
    }
    }
}
