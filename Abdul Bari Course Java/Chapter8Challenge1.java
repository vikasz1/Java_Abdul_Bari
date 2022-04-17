import java.util.Scanner;

public class Chapter8Challenge1 {
    public static void main(String[] args) {
        //1.Display multiplication table
        //2.Find Sum of n numbers
        //3.Factorial of a number

        //1. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n for multiplication table:");
        int num = sc.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println(i*num);
            i++;
        }
        //2. 
        System.out.println("Please enter the value of n");
        num = sc.nextInt();
        int sum = 0;
        for(int j=1;j<=num;j++){
            sum += j;
        }
        System.out.println("Sum: " +sum);


        //3 
        System.out.println("Please enter n for factorial: ");
        num = sc.nextInt();
        int result = 1;
        while(num>1){
            result = result * num;
            num -= 1;

        }
        System.out.println(result);
    }


}
