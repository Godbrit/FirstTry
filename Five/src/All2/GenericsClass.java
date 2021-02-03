package All2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class GenericsClass {
    public static void main(String[] args) {

        /* Java5
        List animals = new ArrayList();
        animals.add("cat"); //добавить объекта в динамическом  режиме
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);
        */


        //////////Generic////////////////
        List<String> animals2 = new ArrayList<String>();  // В данном Array мождет хранится только String
        animals2.add("cat"); //добавить объекта в динамическом  режиме
        animals2.add("dog");
        animals2.add("frog");
        String animal = (String) animals2.get(1);
        System.out.println(animal);

        ///////////////JAVA 7 /////////////////////////////
        List<String> animals3 = new ArrayList<>();
        animals3.add("cat"); //добавить объекта в динамическом  режиме
        animals3.add("dog");
        animals3.add("frog");
        String animal4 = (String) animals3.get(2);
        System.out.println(animal4);
    }

}
