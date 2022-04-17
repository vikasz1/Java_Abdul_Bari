import java.util.Scanner;

public class Chapter7Challenge5 {
    public static void main(String[] args) {
        // Menu driven program for Arithmetic operation
        System.out.println("Please enter a and b");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Please choose an operation:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
        String operation = sc.nextLine();

        switch(operation){
            case "add": System.out.println("Addition: "+(a+b));
                    break;
            case "subs": System.out.println("Substraction: "+(a-b));
                    break;
            case "mul": System.out.println("Multiplication: "+(a*b));
                    break;
            case "div": System.out.println("Division: "+(a/b));
                    break;
            default: System.out.println("Invalid option");
                    break;
        }
    }
}
