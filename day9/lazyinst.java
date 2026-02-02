//lazy instantiation example
package day9;

public class lazyinst {
    public static void main(String[] args) {
        car c = new car();
        c.createEngine();
        System.out.println(c.e.hp);
    }
}
class Engine{
    int hp ;
}
class car{
    Engine e;
    public void createEngine(){
        if(e==null){
            e = new Engine();
            //e.hp=150;
        }
        //return e;
    }
}