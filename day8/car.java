//to create car object 
package day8;
public class car {
    public static void main(String[] args) {
        c c1 = new c();
        c1.model = "BMW";
        c1.color = "Black&White";
        c1.year = 1998;
        System.out.println("model : " + c1.model);
        System.out.println("color : " + c1.color);
        System.out.println("year : " + c1.year);
    }
}
public class c{
    String model;
    String color;
    int year;
}