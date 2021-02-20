package ALL1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass1 {
    public static void
    main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        // a < b < c
        // aa < ab <bb

        hashSet.add("BOB");
        hashSet.add("Carl");
        hashSet.add("Mike");
        hashSet.add("KEKW");
        hashSet.add("KekL");
        hashSet.add("KekL");
        hashSet.add("Carl");   //Ссылка на предыдущее значение с таким же именем
        System.out.println(" ");
        System.out.println(" ");

        for (String name: hashSet
             ) {
            System.out.println(name);
        }


        linkedHashSet.add("Carl");
        linkedHashSet.add("KEKW");
        linkedHashSet.add("Mike");
        linkedHashSet.add("KekL");
        System.out.println(" ");
        System.out.println(" ");

        for (String name: linkedHashSet
        ) {
            System.out.println(name);

        }
        treeSet.add("Carl");
        treeSet.add("KEKW");
        treeSet.add("Mike");
        treeSet.add("KekL");
        System.out.println(" ");
        System.out.println(" ");

        for (String name: treeSet
        ) {
            System.out.println(name);

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(hashSet.contains("Bob"));//true or false
        System.out.println(hashSet.contains("KEKW"));
        System.out.println(hashSet.contains("Bob2"));
        System.out.println(hashSet);

        //объединение - union
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(0);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(9);
        set2.add(3);
        set2.add(7);
        set2.add(5);

        Set<Integer> set3 = new HashSet<>(set1); //set 3 = set 1;
        set3.addAll(set2);    //добавление всех элементов в set3
        System.out.println(set3);

        //Intersection - пересечение множеств

        Set<Integer> set4 = new HashSet<>(set1); //set 4 = set 1;
        set4.retainAll(set2);    //Сохрани все элемены, которые также присутствует в set2
        System.out.println(set4);

        //difference - разность множеств

        Set<Integer> set5 = new HashSet<>(set1); //set 4 = set 1;
        set5.removeAll(set2);    //удал все элемены, которые также присутствует в set2
        System.out.println(set5);



    }

}
