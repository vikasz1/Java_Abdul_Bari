import java.time.Year;

public class Chapter9Challenge14 {
    public static void main(String[] args) {
        // Multiplying two matrices
        int A[][] = { { 1, 2, 3 }, {2, 4, 6 },{1,1,1} };
        int B[][] = { { 2, 4 ,2},{ 1,2, 1 },{ 2,1, 2 } };

        int C[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                for (int k = 0; k < C.length; k++)
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
        }
        for (int x[]:C){
            for (int y : x){
                System.out.format("%2d ",y);
            }
            System.out.println("");
        }

    }
}
