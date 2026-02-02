//Is-A relationship example
package day9;
public class isA {
    //using constructor 
    public static void main(String[] args) {
        
        cardio c = new cardio();
        c.name = "John";
        System.out.println("Name: " + c.name);
        System.out.println("Specialization: " + c.spec);
        c.checkpulse();
    }
}
class doctor{
    String name;
    int linc; //license number
    doctor(String name, int linc){
        this.name = name;
        this.linc = linc;
    }
    doctor(){
        this.name = "";
        this.linc = 0;
    }
    void checkpulse(){
        int a = 70;
        System.out.println("Checking pulse..." +a);
    }
}
class cardio extends doctor{
    String spec;
    cardio(){
        super();
        this.spec = "Cardiology";
    }
}
