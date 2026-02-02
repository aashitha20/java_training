package javatraining;

public class palindrome {
    public static void main(String[] args) {
        String s; 
        String rev = "";

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        s = sc.nextLine();  

        int len = s.length();

        for ( int i = len - 1; i >= 0; i-- )
            rev = rev + s.charAt(i);
        if (s.equals(rev))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome"); 

    }
}
