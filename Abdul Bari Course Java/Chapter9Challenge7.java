import java.util.Scanner;

public class Chapter9Challenge7 {
    public static void main(String[] args) {
        //Deleting an element
        int[] A = new int[10];
        A[0]= 1;A[1] = 2;A[2] = 3;A[3] = 4;A[4]=5;
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        for (int i= index;i<A.length-1;i++){
            A[i] = A[i+1];
        }
        for (int j = 0;j<n-1;j++){
            System.out.print(A[j]+" ");
        }

    }
}
