import java.util.Scanner;
import java.lang.Math;
// find roots of a given quadratic equation

class Chapter5Challenge2{
    public static void main(String[] args) {
        int a,b,c;
        float d,root1,root2;

        System.out.println("Please enter a,b and c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = b*b - 4*a*c;
        root1 = (-b+(float)Math.sqrt(d))/(2*a);
        root2 = (-b-(float)Math.sqrt(d))/(2*a);
        System.out.println("root1="+root1+" "+"root2="+root2);

    }
}