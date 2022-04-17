public class Chapter10Challenge2_Overloading_reverse {

    static int reverse(int num){
        int rev = 0;
        while(num>0){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        return rev;
    }

    static int[] reverse(int A[]){
        int B[] = new int[A.length];
        for (int i=0,j = A.length-1;i<A.length;i++,j--){
            B[j] = A[i];
        }
        return B;
    }
    public static void main(String[] args) {
        int Vikas[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(reverse(12431));


        for (int x:reverse(Vikas)){
            System.out.print(x+" ");
        }
    }
}
