class SThread extends Thread{
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSlepping {
    public static void main(String[] args) {
        SThread s = new SThread();
        s.start();
        s.interrupt();
    }
}
