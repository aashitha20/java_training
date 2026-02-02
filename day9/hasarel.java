//has-a-relationship instantiation
package day9;

public class hasarel {
    public static void main(String[] args) {
        bike b = new bike();
        System.out.println(b.e.brand);
    }
}
class bike{
    engine e = new engine();
}
class engine{
    String brand = "BMW";
}