class Outer{
    void display(){
        class Inner{
            public void show(){
                System.out.println("hello");
            }
        }
        Inner i  = new Inner();
        i.show();
    }
}


public class Chapter15InnerClassPractice {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
