package day8;

public class encap {
    public static void main(String[] args) {
        //can not access private members directly
        student s1 = new student();
        s1.setAge(20);
        int age = s1.getAge();
        System.out.println("Age: " + age);
    }
}
class student{
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
