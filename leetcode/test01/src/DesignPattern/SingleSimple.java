package DesignPattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class SingleSimple {



}
class Singleton{
    private static volatile Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

