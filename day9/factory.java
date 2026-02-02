//to show factory method
package day9;

public class factory {
    public static void main(String[] args) {
    	Board b = Board.createBoard(100);
		System.out.println(b.price);
		}
    }
    class Board{
	int price;
	private Board (int price){
		this.price = price; 
	}
	public static Board createBoard(int price){
		return new Board(price);
	}
}
