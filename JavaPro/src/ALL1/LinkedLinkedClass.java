package ALL1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLinkedClass {
    public static void main(String[] args) {
        List <Integer> linkedList = new LinkedList<>();
//Хранится цепочка объектов с ссылками.
        List<Integer> arrayList = new ArrayList<>(); // При использование считывания целесообразно использовать ArrayList
        measuretime(linkedList);
        measuretime(arrayList); // При использовании добавления массива целесообразние использовать ArrayList
    }
    private static void measuretime (List<Integer> list){

        for (int i = 0; i < 1000000 ; i++) {
            list.add(i+1000);
        }
        long start = System.currentTimeMillis(); //время в миллисекундах

        for (int i = 0; i < 10000 ; i++) {
            list.get(i);
        }

        long end = System.currentTimeMillis(); //

//System.out.println(end - start);

        long start2 = System.currentTimeMillis(); //время в миллисекундах

        for (int i = 0; i < 10000 ; i++) {
            list.add(0, i); // добавление в начало массива число
        }

        long end2 = System.currentTimeMillis(); //

        System.out.println(end2 - start2);

    }
}