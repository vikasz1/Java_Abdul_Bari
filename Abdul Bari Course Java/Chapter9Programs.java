public class Chapter9Programs {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = {1,2,3,4,6,3,22};
        for (int x: B){
            System.out.print(x+"-");
        }
        System.out.println("");
        for (int i= 0;i<B.length;i++){
            System.out.print(B[i]+" ");
        }
    }
}
