class StaticTest{
    static int a = 10;
    int b = 20;
    void show(){
        System.out.println(a+" "+b);
    }
    static void display(){
        System.out.println(a);
    }
}

public class Chapter16StaticVariable {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        st1.show();
        st1.a = 30;
        st1.b = 40;

        StaticTest st2 = new StaticTest();
        st2.show();
    }
}
