class thread{
    public static void main(String[] args){
        Thread a = new TThread();
        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("jj");
    }
}
class TThread extends  Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        }catch(InterruptedException e){}
        System.out.println("hello");
    }
}
