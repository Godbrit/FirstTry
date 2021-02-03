public class StaticNewExample {
    static StaticNewExample staticNewExample = new StaticNewExample(); //вначале идут нестатические переиенные
    static int n = 4;
    static int i = returnIntStatic();
    static int k=3;
    int j = returnInt();
    int p = returnIntStatic();
    static {
        System.out.println("static init");
    }



    StaticNewExample() {
        i++;
        System.out.println("Constructor");
    }
    {
        System.out.println("init");
    }
    static void staticNewMethod() {
        System.out.println("static method");
    }
   static int returnIntStatic(){
        System.out.println(n);
        System.out.println(k);
        System.out.println("return static int");
        return 1;
    }

    int returnInt(){
        System.out.println("return init");
        return 2;
    }


    public static void main(String[] args) {
        new StaticNewExample();
    }
    }
