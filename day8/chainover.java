//create laptop object
//constructor overloading and constructor chaining 
package day8;

public class chainover {
    public static void main(String[] args) {
    // laptop l1= new laptop();
    // laptop l2= new laptop("Pink");
    // laptop l3= new laptop("Black",50000);
    laptop l4= new laptop("White",60000,"Dell");
    }
}  
class laptop{
    String color; //white
    int price;  
    String brand;

    public laptop(){
        System.out.println("laptop created");     //laptop created
    }
    public laptop(String color){//white
        this(); 
        this.color=color;
        System.out.println(this.color);
    }
    public laptop(String color , int price){//white, 60000
        this(color);
        this.price=price;
        System.out.println(this.price);
    }
    public laptop(String color , int price ,String brand){ //white, 60000,Dell
        this(color,price);
        this.brand=brand;
        System.out.println(this.brand);
    }
}