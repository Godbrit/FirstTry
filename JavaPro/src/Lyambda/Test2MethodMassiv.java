package Lyambda;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Test2MethodMassiv {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        int [] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        int [] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        int [] arr4 = new int[10];
        List<Integer> list4 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);

        fillArr(arr2);
        fillList(list2);

        fillArr(arr3);
        fillList(list3);

        fillArr(arr4);
        fillList(list4);


        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < 10 ; i++) {
            arr1[i] = arr1[i] * 2;
            list1.set(i, list1.get(i)*2);
        }
        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

       arr1 = Arrays.stream(arr1).map(i -> i*2).toArray(); //поток массива//сопоставление нового элемента//преобразование потока в массив
        list1 = list1.stream().map(a ->a * 2).collect(Collectors.toList());


        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));


        int[] arr11 = Arrays.stream(arr1).map (a -> 3).toArray(); //весь массив в 3
        arr11 = Arrays.stream(arr11).map (a -> a + 1).toArray(); //весь массив в 4
        System.out.println(Arrays.toString(arr11));

        //////////////////////////////////////////////////////////////////////////



       arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
       list2 = list2.stream().filter(a-> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println); //list2.stream().forEach(System.out::println)


        //[1,2,3] - начальное значение acc = arr[i] и начало итераций со 2 элемента.

        int sum1 = Arrays.stream(arr3).reduce(Integer::sum).getAsInt(); //((acc, b) ->acc + b)
        int sum2 =list3.stream().reduce((acc, b) -> acc * b).get();  // (0 (acc,b) ->

        System.out.println(sum1);
        System.out.println(sum2);


        int[] array232 = Arrays.stream(arr4).filter(a-> a % 2 != 0).map(a -> a * 2).toArray();              //нечётные числа
        System.out.println(Arrays.toString(array232));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(333);
        set.add(56);
        System.out.println(set);
        set = set.stream().map(a2-> a2 * 3).collect(Collectors.toSet());
        System.out.println(set);


    }



    private static void fillArr(int[] arr) {
        for (int i = 0; i <10 ; i++) {
            arr[i] = i+1;

        }

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);

        }
    }
}
