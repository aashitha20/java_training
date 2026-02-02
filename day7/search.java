//to search an element in an array and print its index
package day7;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        int [] a = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        //take element to be searched from user
        System.out.println("enter element to be searched: ");
        int key = sc.nextInt();
        //search element in array
        int index = -1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                index = i;
                break;
            }
        }
        //print index
        if(index!=-1){
            System.out.println("element found at index: "+index);
        } else {
            System.out.println("element not found");
        }
    }
}
