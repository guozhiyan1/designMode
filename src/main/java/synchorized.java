public class synchorized {
    public static void main(String[] args) throws InterruptedException {
       Thread t1=new add();
       Thread t2=new des();
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.println(score.count);
    }
}
class score{
    public static int count=0;
    public static Object lock=new Object();
}
class add extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (score.lock) {
                score.count = score.count + 1;
            }
        }
    }
}

class des extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            synchronized (score.lock) {
                score.count = score.count - 1;
            }
        }
    }
}


