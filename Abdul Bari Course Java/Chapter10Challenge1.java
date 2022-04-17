public class Chapter10Challenge1 {

    static int findMax(int A[]){
        int max = A[0];
        for (int x : A){
            if (x>max) max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,6,4,1,8,9,7,12,21,34};
        System.out.println(findMax(arr));
    }
}
