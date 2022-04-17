public class Chapter9Challenge8 {
    public static void main(String[] args) {
        //Copying an array
        int A[] = {4,2,1,3,6,8};
        int B[] = new int[6];

        for (int i=0;i<A.length;i++){
            B[i] = A[i];
        }
        //Printing B
        for (int x: B){
            System.out.print(x+" ");
        }
        
    }
}
