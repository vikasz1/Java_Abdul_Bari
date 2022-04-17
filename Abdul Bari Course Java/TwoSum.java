import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers:");
        int a,b,c;
        Scanner s  = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Sum of "+a+"+"+b+"="+c);
    }

}
