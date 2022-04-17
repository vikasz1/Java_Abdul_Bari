class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }
}

public class ThreadMore {
    public static void main(String[] args) {
        Mythread myThread = new Mythread("Pyara thread 1!!!");
        System.out.println(myThread.getId());
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());
        System.out.println(myThread.getState());
        System.out.println(myThread.isAlive());
    }
    
    
}
