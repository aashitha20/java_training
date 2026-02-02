//to display method overriding
public class methodoverridde {
    public static void main(String[] args) {
        Parent p = new Child(); //upcasting
        p.show();
    }
}
public class Parent{
    public void show(){
        System.out.println("Parent Show Method");
    }
    // displays run time binding & compile time checking 
}
public class Child extends Parent{
    public void show(){
        System.out.println("Child Show Method");
    }
}
