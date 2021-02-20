package ALL1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        Map<String, String> translations = new HashMap<>();

        translations.put("Кошка", "cat");
        translations.put("Собака", "dog");
        translations.put("Лягуха", "frog");

        for (Map.Entry<String, String> entry: translations.entrySet()
        ) {
            System.out.println(entry.getKey() + " : " +  entry.getValue());
    }
        Map <Integer, String> hashMap = new HashMap<>();   //внутри не гарантируется порядок

        Map <Integer, String> linkedHashMap = new LinkedHashMap<>();    // в каком порядке пары  (ключ, знначение) были добавлена, в таком порядки они и вернутся

        Map <Integer, String> treeMap = new TreeMap<>(); //Лексографический порядок или числовой порядок. Сортировка по ключу. Естественный порядок

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
}

public static void  testMap (Map<Integer, String> map){
        map.put(39, "BOB");
    map.put(139, "Carl");
    map.put(-39, "Mike");
    map.put(0, "KEKW");
    map.put(1500, "KekL");
    System.out.println(" ");
    System.out.println(" ");

    for (Map.Entry<Integer, String> entry: map.entrySet()
    ) {
        System.out.println(entry.getKey() + " : " +  entry.getValue());
    }

    }
}

