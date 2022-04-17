import java.util.Scanner;
import java.lang.Math;
public class Chapter5Challenge {
     public static void main(String[] args) {
         //calculating area with base and height
         float base,height,area;
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the base of the triangle:");
         base = sc.nextFloat();
         height = sc.nextFloat();
         System.out.println("Please enter the height of the triangle:");
         area = (1f/2f)*(base*height);
        System.out.println("Area of the triangle is : "+ area);

        //calculating area with all sides of the triangle
        float a,b,c,s,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sides : a, b, c");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a+b+c)/2f;
        System.out.println("Value of S is "+ s);

        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

     }
    
}
