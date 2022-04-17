public class Chapter10_GCD {

    static int GCD(int a,int b){
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        // GCD
        int m = 56,n = 35;
        System.out.println(GCD(m, n));
        
    }
}
