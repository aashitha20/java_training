package day8;

public class static {
    public static void main(String[] args) {
        c c1 = new c();
        c1.brand = "BMW";
        c1.color = "Black&White";
        c1.year = 1998;
        System.out.println("model : " + c1.brand);
        System.out.println("color : " + c1.color);
        System.out.println("year : " + c1.year);
    }
}
public class c{
    String brand;
    String color;
    int year;
    public void start(){
        System.out.println("can start ");
    }
}