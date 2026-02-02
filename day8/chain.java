//constructor chaining
package day8;

public class chain {
    public static void main(String[] args) {
        Student s1 = new Student("Ahana", 24);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }

}
class pen{
    String color;
    int price;
    pen(){
        System.out.println("pen is created");
    }
    pen(String color){
        this.color = color;
        System.out.println("color: " + color);
    }   

    pen(String color, int price) {
        this.color = color;
        this.price = price;
        System.out.println("pen created");
    }
    
}