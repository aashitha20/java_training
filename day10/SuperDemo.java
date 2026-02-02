//super keyword
public class SuperDemo{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
class Parent{
    String name = "parent";
}
class Child extends Parent{
    String name = "child";
    public void display(){
        String name = "skanda";
        System.out.println(this.name); //child name
        System.out.println("Name: " + name); //child name
        System.out.println("Name: " + super.name); //parent name
    }
}