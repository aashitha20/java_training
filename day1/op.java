//implementing ternary operator and pre and post increment/decrement
package javatraining;
public class op {
    public static void main(String[] args) {
        //int x = 50 ,y = 12;
        
        // String res = x<y ? "hi" : "hello"; 
        // System.out.println(res); 

        // int a=20, b=-10;
        // int c=a + ++b;
        // int d=a++ - b++ + ++c;
        // System.out.println(" "+a+" "+b+" "+c+" "+d);

        
         int a=20, b=-10;
         int c=a + --b;
         int d=a-- - b-- + --c;
         System.out.println(" "+a+" "+b+" "+c+" "+d);
    }

}
