public class Chapter9Challenge13 {
    public static void main(String[] args) {
        //1.Add two matrix
        int A[][] = {{1,2,3},{2,4,6}};
        int B[][] = {{2,4,6},{1,1,1}};

        int C[][] = new int[2][3];

        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Resultant Array is");
        for(int x[]:C){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
