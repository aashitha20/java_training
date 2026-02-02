//to exhibit contructor 
package day8;

public class construct {
    public static void main(String[] args) {
        Student s1 = new Student("Ahana", 24);
        // System.out.println("Name: " + s1.name);
        // System.out.println("Age: " + s1.age);
        // s1.name = "Aashi";
        // System.out.println("name:  " + s1.name);
        Student s2 = new Student("Aashi");
        Student s3 = new Student ();
        Student s4 = new Student("20");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);
        System.out.println("Name: " + s4.name);
        System.out.println("Age: " + s4.age);
    }
}
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student() {
    }
    
    Student(String name){
        this.name = name;
    }
    Student(int age){
        this.age = age;
    }
}