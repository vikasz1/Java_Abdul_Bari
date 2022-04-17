public class Chapter9Challenge3 {
    public static void main(String[] args) {
        int []A = {1,2,3,4,5};
        int max = A[0];
        for (int x: A){
            if (x>max){
                max = x;
            } 
        }
        System.out.println("max: "+max);

    }
}
