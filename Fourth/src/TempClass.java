public class TempClass {
    static void method (int i, float f, boolean b, String s, Object o, int... j)
    {
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(o);
        System.out.println(s);
        for (int k:j) {
            System.out.println(k);
        }

    }
    }
class Other extends TempClass {
    public static void main(String[] args) {
        TempClass.method(10,4.322f,true, "hello", new Object(), 123213,2323,23243,2,1,12,4,4,5);
    }
}

