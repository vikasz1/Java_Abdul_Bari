import java.util.Scanner;

public class Chapter9Challenge6 {
    public static void main(String[] args) {
        int[] A = new int[10];
        A[0]= 1;A[1] = 2;A[2] = 3;A[3] = 4;A[4]=5;
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int num  = sc.nextInt();
        int index = sc.nextInt();
        for (int i = n-1;i>=index;i--){
            A[i+1] = A[i];
        }
        A[index] =  num;
        for (int i = 0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
}
