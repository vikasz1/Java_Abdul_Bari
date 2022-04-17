import java.lang.*;
import java.util.Scanner;

class First{
    public static void main(String[] args){
        // System.out.println("Hello World!!!");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int a = s.nextInt();
        System.out.println(a);
        // Take name as input
        System.out.println("Please enter a name:");
        String name = s.next();
        System.out.println("hello "+name);
    }
}