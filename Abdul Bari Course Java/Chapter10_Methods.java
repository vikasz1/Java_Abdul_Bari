public class Chapter10_Methods {

    static int max(int a, int b){
        if (a>b) return a;
        else return b;
    }
    public static void main(String[] args) {
        int a = 10,b = 15,c;
        c = max(a,b);
        System.out.println(c);
        

    }
}
