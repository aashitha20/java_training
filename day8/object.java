public class object {
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book();
        book b3 = new book();
        b1.title = "Java ";
        b2.title = "Python ";
        b3.title = "C++ ";
        System.out.println("Book 1 title: " + b1.title);
        System.out.println("Book 2 title: " + b2.title);
        System.out.println("Book 3 title: " + b3.title);
    }
}
class book {
    String title;
    String author;
    int pages;
}