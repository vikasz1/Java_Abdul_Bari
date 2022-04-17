public class Chapter10Challenge7 {
    static int findSum(int ...a){
        int sum = 0;
        for (int x:a){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(findSum(3,4,5));
    }
}
