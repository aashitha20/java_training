//to display upcasting in java
public class upcast {
    public static void main(String[] args) {
        Parent p = new Child(); //upcasting
        p.show();
    }
}
class Parent{
    public void show(){
        System.out.println("Parent Show Method");
    }
}
class Child extends Parent{
    public void show(){
        System.out.println("Child Show Method");
    }
}
