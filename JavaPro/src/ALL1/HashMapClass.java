package ALL1;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;

public class HashMapClass {
    public static void main(String[] args) {
        // 1 -> [... ... ...]
        // 2 -> [. . . ...]
        Map<Integer, String> map = new HashMap<>(); //ключ - номер, интерфейс - массив

        map.put(1, "Один");    //ключ, значения
        map.put(2, "Два");
        map.put (3, "Три");
        map.put(5, "Один");
        map.put(4, "двад+");  //старое значение переписывается
        // не может быть одинаковых ключей

        System.out.println(map);
        System.out.println(map.get(0));


        for (Map.Entry<Integer, String> entry: map.entrySet()      //Entry - целое число на строку, entryset - возвращение всех объектов класса Entry
             ) {
            System.out.println(entry.getKey() + " : " +  entry.getValue());    //getKey - получение ключа и getValue - значение
            
        }
        
        
    }
}

