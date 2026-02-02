// to implemet binary search to already sorted array 
package day7;
import java.util.Scanner;
public class binaryarr {
    public static void main(String[] args) {
        int [] a = new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in sorted order: ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        } 
        //take element to be searched from user
        System.out.println("enter element to be searched: ");
        int key = sc.nextInt();
        //binary search
        int left = 0;
        int right = a.length - 1;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(a[mid] == key){
                index = mid;
                break;
            } else if(a[mid] < key){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //print index
        if(index != -1){
            System.out.println("element found at index: " + index);
        } else {
            System.out.println("element not found");
        }

    }
}
