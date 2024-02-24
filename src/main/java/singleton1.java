//饿汉式，类加载就初始化如果没被使用就浪费了，影响启动速度
class singleton1 {
    public static int count=0;
    private static singleton1 a=new singleton1();
    //私有构造方法，不允许别人创建实例
    private singleton1(){}
    //只有一个方法可以通过外界调用,调用静态方法返回类实例。
    public static singleton1 getcount(){
        count=count+1;
        System.out.println(count);
        return a;
    }

    public static void main(String[] args) {
        //不能创建实例，直接调用方法
        singleton1.getcount();
    }
}


