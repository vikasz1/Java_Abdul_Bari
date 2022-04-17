public class Chapter9Challenge1 {
    public static void main(String[] args) {
        //1. Finding the sum of all elements
        int sum = 0;
        int []A = {1,2,3,4,5};
        for (int x: A){
            sum += x;
        }
        System.out.println("Sum : "+sum);
    }
}
