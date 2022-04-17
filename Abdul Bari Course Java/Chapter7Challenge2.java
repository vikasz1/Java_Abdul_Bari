import java.util.Scanner;

public class Chapter7Challenge2 {
    public static void main(String[] args) {
        // check if a year is leap year or not
        // Find radix of a number
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }
        else if(year%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        // Finding radix
        String number = "101A0";
        if(number.matches("[0-1]+")){
            System.out.println("Binary number Radix=2");
        }
        else if(number.matches("[0-7]+")){
            System.out.println("Octal Number Radix=8");
        }
        else if (number.matches("[0-9]+")){
            System.out.println("Decimal number Radix=10");
        }
        else if(number.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Number Radix=16");
        }

    }
}
