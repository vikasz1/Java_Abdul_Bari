import java.util.Scanner;

public class ReadBinary {
    public static void main(String[]    args) {
        Scanner sc = new Scanner(System.in);
        sc.useRadix(2);
        int a = sc.nextInt();
        System.out.println(a);
    }
}
