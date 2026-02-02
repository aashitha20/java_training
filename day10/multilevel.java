//multi-level inheritance
package day10;
public class multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.familyName = "fam name";
        c.parentName = "parent name";
        c.childName = "child name";
        c.showFamily();
        c.showParent();
        c.showChild();
    }
}
class GrandParent{
    String familyName;
    public void showFamily(){
        System.out.println("Family Name: " + familyName);
    }
}
class Parent extends GrandParent{
    String parentName;
    public void showParent(){
        System.out.println("Parent Name: " + parentName);
    }
}
class Child extends Parent{
    String childName;
    public void showChild(){
        System.out.println("Child Name: " + childName);
    }
}