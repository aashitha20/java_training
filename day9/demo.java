//to display compile time error for private constructor
package day9;
public class demo {
        public static void main(String[] args) {
            board b = new board(10);
            System.out.println(b.p);
    }
}
class board{
    int p;
    private board(int p){
        this.p= p;
    }
}