public class StaticExample {
    static int i;
    int j;
    static  {
        i=6;
        System.out.println("static init");
    }
    {
        //System.out.println("init");
    }
    StaticExample() {
        i++;
        System.out.println("Constructor");
    }
    static void staticmetxhod()
    {
        i=7;
        System.out.println("static method");
    }
    public static void main(String[] args) {
        System.out.println(StaticExample.i);
               StaticExample staticExample = new StaticExample();
                staticExample.j = 1;
        System.out.println(staticExample.j);
       StaticExample staticExample1 = new StaticExample();
         staticExample1.j = 2;
        System.out.println(staticExample1.j);
        StaticExample.staticmetxhod();
        System.out.println(staticExample1.i);
    }
}
