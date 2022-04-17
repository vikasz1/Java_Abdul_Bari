public class Chapter9Challeng11 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int[] B = new int[A.length*2];
        System.out.println(A.length);
        // Copy all elements A to B
        for (int i=0;i<A.length;i++){
            B[i] = A[i];
        }
        A = B;
        B = null;
        System.out.println(A.length);
    }
}
