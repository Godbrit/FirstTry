package ALL1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItterableClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator(); //возвращение объекта класса

        int idx = 0;

        while (iterator.hasNext())//указатель на элемент объекта до 1 объекта.
        {
            if (idx ==1) {
                iterator.remove();
            }
            System.out.println(iterator.next());
            idx++;
        }

            //Java 5
        for (int x: list   //Использование итератора
             ) {
            //list.remove(1); //нет возможности убрать значения
            System.out.println(x);


        }

    }
}
