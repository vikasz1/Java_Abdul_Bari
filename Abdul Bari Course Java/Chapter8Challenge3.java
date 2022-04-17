import java.util.Scanner;

public class Chapter8Challenge3 {
    public static void main(String[] args) {
        // 1.Display AP - Arithmetic Progression
        // System.out.println("Please enter the value of a, d and n");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int d = sc.nextInt();
        // int n = sc.nextInt();

        // for (int i=1;i<=n;i++){
        //     int A = a + (i-1)*d;
        //     System.out.print(A+", ");
        // }
        // System.out.println("");

        // // 2. Display Geometric progression
        // System.out.println("Please enter the value of aG, rG and nG");
        Scanner sc1 = new Scanner(System.in);
        // int aG = sc1.nextInt();
        // int rG = sc1.nextInt();
        // int nG = sc1.nextInt();
        // int Ga = 1;
        // System.out.print(aG);
        // for(int i=1;i<nG;i++){
        //     Ga =a*Ga*rG;
        //     System.out.print(Ga+", ");
        // }
        //3. Fibbonacci series
        System.out.println("Fibbo n: ");
        int fibbo_n = sc1.nextInt();
        int first = 0;
        int second = 1;
        int result  = 0;
        System.out.print(first+" "+second+" ");
        for(int i=0;i<fibbo_n;i++){
            result = first + second;
            System.out.print(result+" ");
            first = second;
            second = result;
        }

        // 3. Display Fibbonacci series

    }
}
