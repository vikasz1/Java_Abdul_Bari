abstract class Super_Abs{
    Super_Abs(){
        System.out.println("Super Class created");
    }
    void meth1(){
        System.out.println("Method 1");
    }
    abstract void meth2();
}

class Sub_Abs extends Super_Abs{
    @Override
    void meth2(){
        System.out.println("Vikas helped method 2");
    }
}

class Chapter13_AbstractClasses{
    public static void main(String[] args) {
        Sub_Abs sub = new Sub_Abs();
        sub.meth2();
    }
}