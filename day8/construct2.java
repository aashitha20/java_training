package day8;

public class construct2 {
    public static void main(String[] args) {
        pen p1= new pen("Blue", 20);
        pen p2= new pen("Black");
        pen p3= new pen();
        p1.display();
        p2.display();
        p3.display();
    }
}

class pen{
    String color;
    int price;
    String brand;
    pen(){
        System.out.println("pen created");
    }
    pen(String color ){
        this();
        this.color=color;
    }
    pen(String color, int price){
        this(color);
        this.price=price;
    }
    public void display(){
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("brand: " + brand);
    }
        
}