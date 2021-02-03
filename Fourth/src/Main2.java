import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main2 {

    Object o;
    public static void main(String[] args) {
        method();
        //date помечается, как возможный на удаление при отсутсвии дополнительных ссылок на объект
       Date dt = method3(); //При наличие ссылки обхект не помечается на удаление
        dt = null;   // При использование null => отсутствует ссылки => помечается на удаление
        System.gc(); // Просьба на удаление объектов
        method2();


    }

    private static void method()
    {
        Date date = new Date(); //объявление переменной и создание объекта. Приписывание ссылки на объект
        Date date2;
        date2 = new Date();
        System.out.println(date);
    }
    private static void method2()
    {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Free Memory " + runtime.freeMemory());
        System.out.println("Total Memory " + runtime.totalMemory());
        List<Date> dateList = new ArrayList<>(10000000);
        for (int i = 0; i < 10000000 ; i++) {

            Date date3 = new Date();
            date3 = null;
         dateList.add(date3);
        }

        System.out.println("Free Memory after " + runtime.freeMemory());
        System.out.println("Total Memory after " + runtime.totalMemory());
        dateList = null;
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.out.println("Free Memory after after " + runtime.freeMemory());
        System.out.println("Total Memory after after " + runtime.totalMemory());
    }
    private static Date method3()
    {
        Date date = new Date(); //объявление переменной и создание объекта. Приписывание ссылки на объект
        Date date2 = new Date();
        System.out.println(date2);
        return date2;
    }
    @Override
    public void finalize() {
        System.out.println("FFF");
    }
}
