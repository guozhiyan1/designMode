public class deadlock{
    public static void main(String[] args) {
        Thread t1=new t("A","B");
        Thread t2=new t("B","A");
        t1.start();
        t2.start();
    }
}
class t extends Thread{
    public String a="";
    public String b="";
    public t(String a,String b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void run(){
        try{
            synchronized (this.a){
                sleep(10);
                synchronized (this.b){
                    sleep(10);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}