class MyRun implements Runnable {
    // @override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i+" Hello");
            i++;
            // System.out.println(Thread.currentThread());
        }
    }
}


public class RunnableExample {
    public static void main(String[] args) {
        MyRun m = new MyRun();
        Thread t = new Thread(m,"Vikas ka thread");
        t.setPriority(10);
        t.start();
        int i = 1;
        while(true) {
            System.out.println(i+" World"+t.getState());
            Thread.currentThread().setPriority(6);
            System.out.println(Thread.currentThread());
            i++;
        }
    }
}
