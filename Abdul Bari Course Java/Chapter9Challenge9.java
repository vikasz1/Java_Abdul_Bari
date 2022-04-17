public class Chapter9Challenge9 {
    public static void main(String[] args) {
        // reverse copy an array
        int A[] = { 4, 2, 1, 3, 6, 8 };
        int B[] = new int[6];

        // for (int i=0;i<A.length;i++){ //Method 1
        // B[A.length-1-i] = A[i];
        // }

        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) { // Method 2
            B[j] = A[i];
        }

        for (int x : B) {
            System.out.print(x + " ");
        }

    }
}
