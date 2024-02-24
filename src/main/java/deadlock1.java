public class deadlock1 {
    public static void main(String[] args) {

    }
}
class thread1 extends Thread{
    @Override
    public void run(){
        Thread t=new thread2();
        t.start();
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        Thread t=new thread1();
        t.start();
    }
}