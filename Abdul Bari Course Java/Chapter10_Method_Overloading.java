public class Chapter10_Method_Overloading {

    static int max(int a,int b){
        return a>b?a:b;
    }
    static float max(float a,float b){
        return a>b?a:b;
    }
    static int max(int a,int b,int c){
        return a>b && a>c? a: (b>c && b>a?b:c);
    }
    public static void main(String[] args) {
        System.out.println(max(3, 5, 8)); 
    }
}
