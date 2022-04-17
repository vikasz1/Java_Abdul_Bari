public class Chapter9Challenge12 {
    public static void main(String[] args) {
        int A[][] = new int[5][5];

        int B[][]  = {{1,2,3},{2,4,5},{1,3,5}};

        int C[][];
        C = new int[5][5];
        // Traversing
        for (int i = 0;i<B.length;i++){
            for (int j = 0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
