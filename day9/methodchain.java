package day9;

public class methodchain {
    public static void main(String[] args) {
        chain ch = new chain();
        ch.setPrice(1000);
        ch.setColor("Green");
        System.out.println(ch.getPrice());
        System.out.println(ch.getColor());
        System.out.println(ch.setColor("red").getColor());
        System.out.println(ch.setColor("black").setPrice(100).getPrice());
        System.out.println(ch.getColor());
    }
}
class chain{
    private int price;
    private String color;

    public int getPrice() {
        return price;
    }

    public chain setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public chain setColor(String color) {
        this.color = color;
        return this;
    }
}
