import java.util.Scanner;

public class Chapter8Challenge2 {
    public static void main(String[] args) {
        //1. Display digits
        int num = 54654;
        while(num>0){
            int d = num%10;
            num = num/10;
            System.out.println(d);
        }

        //2. Count the digits of a number
        int num2 = 1254532;
        int count = 0;
        while(num2>0){
            num2 = num2/10;
            count += 1;
        }
        System.out.println(count+" digits in given number");
        // 3. Check if number is armstrong or not
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        int safe = num3;
        int result = 0;
        while (num3>0){
            int d1 = num3%10;
            result = result+d1*d1*d1;
            num3  = num3/10;
        }
        if (result == safe){
            System.out.println(result+" is a armstrong number.");

        }else{
            System.out.println("No");
        }
        // 4. Reverse a number
        int num4 = 123261;
        int safe1 = num4;
        int Reverse = 0;
        while(num4>0){
            int dd = num4%10;
            Reverse = Reverse*10+dd;
            num4 = num4/10;
        }
        System.out.println(Reverse);
        // 5.Check if a number is palindrome or not
        if (safe1==Reverse){
            System.out.println("yes it is a palindrome.");
        }
        else{
            System.out.println("No its not a palindrome.");
        }


    }
}
