package ALL1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapClass1 {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();   // 1 -> "Hello", 2 -> "Hello" // не может сущестовать два одинаковых ключа

        map.put("Bob", 25);
        map.put("Kitty", 45);
        map.put("Bill", 15);

        Set<String> set = new HashSet<>(); //1, 2  два одинаковых значений не может хранится
        // Внутри HashSet находится HashMap
/*
Реализация массив List.
Node<K,V> [] table;
Node<K,V>
int hash;
K key;
V value;
Node<K,V> next;



put( K k, V v)

hash(k)  (2306996)

index = hash & (*) (n-1) (n=16)
// если при этом подсчёте одинаковый индекс, то есть лежат в одинаковой ячейке,
// В данном случае добавляется в конец связанного  списка.
//.get() - Проверка равенства хэшей и индекса плюс дополнительная проверка equals

 */


    }

}
