//display single level heritance showing parent child relationship using super keyword
public class singlelevel {
    public static void main(String[] args) {
        Child c = new Child("Aashi", 20);
        c.earn();
        c.spend();
        c.display();
    }
}
public class Parent{
    String name;
    public void earn(){
        System.out.println("Earning money...");
    }
}
class Child extends Parent{
    int age;
    String name;

    public Child(String name, int age){
        super.name = name;
        this.age = age;

    }
    
    public void spend(){
        System.out.println("Spending money...");
    }
    public void display(){
        System.out.println("Name: " + name); //child name
        System.out.println("Name: " + super.name); //parent name
    }
}
