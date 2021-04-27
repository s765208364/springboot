package test;

public class Singleton {
    private static volatile Singleton instance;//volatile保证线程间的可见性

    private Singleton(){
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    //同时保证了效率，推荐使用
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
class Singleton2{
        private Singleton2(){

        }

        private static Singleton2 instance;

        static{
            instance = new Singleton2();
        }

        public static Singleton2 getInstance(){
            return instance;
        }
}

