public class Chapter9Challenge4 {
    public static void main(String[] args) {
        int []A = {1,2,3,4,5};
        int max1 = A[0],max2 = A[0];
        for(int i = 0;i<A.length;i++){
            if(A[i]>max1){
                max2 = max1;
                max1 = A[i];
            }
        }
        System.out.println("Second maximum will be "+max2);

    }
}
