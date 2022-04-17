class MyData1 {

    synchronized public void display(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(i));
            try {Thread.sleep(100);} catch (Exception e) {System.out.println(e);}
        }
    }
}

class Mythread1 extends Thread {
    MyData1 d;

    public Mythread1(MyData1 d) {
        this.d = d;
    }

    public void run() {
        d.display("Hello world");
    }
}

class Mythread2 extends Thread {
    MyData1 d;

    public Mythread2(MyData1 d) {
        this.d = d;
    }

    public void run() {
        d.display("Welcome All");
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        MyData1 d = new MyData1();
        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);
        t1.start();
        t2.start();
    }
}
