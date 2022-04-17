class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println(i++ + " Hello");
        }
    }
}


class Test{
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();
        int i = 0;
        while(true){
            System.out.println(i++ + " World");
        }
    }
}