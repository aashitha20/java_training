//hierarchical inheritance example with parent and two children
package day10;
public class hierarchical {
    public static void main(String[] args) {
        Son s = new Son();
        s.name = "son";
        s.age = 20;
        s.earn();
        s.spend();
        System.out.println("Son Name: " + s.name);
        System.out.println("Son Age: " + s.age);

        Daughter d = new Daughter();
        d.name = "daughter";
        d.school = "college";
        d.earn();
        d.study();
        System.out.println("Daughter Name: " + d.name);
        System.out.println("Daughter School: " + d.school);
    }
}
class Parent{
    String name;
    public void earn(){
        System.out.println("Parent Earning money");
    }
}
class Son extends Parent{
    int age;
    public void spend(){
        System.out.println("Son Spending money");
    }
}
class Daughter extends Parent{
    String school;
    public void study(){
        System.out.println("daughter studying");
    }
}