
public class downcast {
    public static void main(String[] args) {
        // shape s = new square();
        // System.out.println(s instanceof shape);
        // System.out.println(s instanceof square);
        // System.out.println(s instanceof triangle);
        // System.out.println(s instanceof Object);
        // square sq = (square)s;
        // triangle t = (triangle) s;//exception 

        shape s = new shape();
        if(!(s instanceof square)){
            s = new square();
            square sq = (square)s;
            System.out.println("downcasted ");
        }
    }
}
class shape{    
    String color = "black";
}
class square extends shape{
    int side = 5;
}
class triangle extends shape{

}