interface Test1{
    public void meth1();
    public void meth2();
}

class Test2 implements Test1{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
}



public class Interface_Practice {
    public static void main(String[] args) {
        Test1 t = new Test2();
        t.meth1();
    }
}
