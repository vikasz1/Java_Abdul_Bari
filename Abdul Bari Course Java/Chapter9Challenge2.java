public class Chapter9Challenge2 {
    public static void main(String[] args) {
        //2. Searching an element
        int []A = {1,2,3,4,5};
        int num = 20;
        for (int i = 0;i<A.length;i++){
            if (A[i]==num){
                System.out.println("Number found at "+i);
                System.exit(0);
            }
        }
        System.out.println("Number not found");
    }
}
