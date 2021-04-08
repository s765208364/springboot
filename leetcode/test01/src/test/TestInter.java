package test;

public interface TestInter {
    public int testMethod1();

    public static int testMethod2(){
        return 0;
    }

    public default int testMethod3(){
        return 0;
    }

    public static int testInt = 0;
}
