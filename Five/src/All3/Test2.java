package All3;

import jdk.nashorn.internal.ir.ReturnNode;

public class Test2 {
    public static void main(String[] args) {
        //someMethod();
        counter(3);
        System.out.println(fac (4));
    }
/*
    private static void someMethod() {
       System.out.println("Hello");
        someMethod();                       //Рекурсия- постоянное использования своего метода
        //необходимо условие выхода из метода

    }


 */


    private static void counter(int n) {
        System.out.println(n);
        if (n == -2)
            return;

            counter(n-1);

        }
    private static  int fac (int x) {
        if (x==1)
            return 1;

        x= x* fac(x-1);

        return x;
    }
}

