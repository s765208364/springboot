package algorithms;

public class LeetCode21 {
    public static void main(String[] args) {
        TestClass t = new TestClass(1,2,3.0);

        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);

        change1(t);

        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);

    }


    public static void change1(TestClass t)
    {
        t.a = 10;
        t.b = 20;
        t.c = 30.0;
    }



}
