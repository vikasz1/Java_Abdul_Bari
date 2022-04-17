public class Chapter10_varargs {

    static void show(int ...x){
        for(int a :x){
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        show(1,2,3);
    }
}
