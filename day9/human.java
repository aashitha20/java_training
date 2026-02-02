package day9;

public class human {
public static void main(String[] args) {
        human hm = new human();
        hm.getHeart().setPulse(145);
        System.out.println(hm.getHeart().getPulse());
        System.out.println(hm.getHeart().getPulse());
    }
}
class Heart{
    private int pulse;
    public void setPulse(int pulse){
        this.pulse= pulse;
    }
    public int getPulse(){
        return pulse;
    }
}
class Human{
    private Heart h = new Heart();
    public Heart getHeart(){
        return h;
    }
}