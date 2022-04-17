public class Chapter9Challenge5_Array_Rotation {
    public static void main(String[] args) {
        int[] A = { 5, 7, 4, 10, 12, 7, 5, 3 };
        // {7,4,10,12,7,5,3,5}Left Rotation by 1
        // left rotation
        for (int j = 0; j <= 2; j++) {
            int temp = A[0];
            for (int i = 0; i < A.length - 1; i++) {
                A[i] = A[i + 1];
            }
            A[A.length - 1] = temp;
        }
        for (int x : A)
            System.out.print(x + " ");
    }
}
