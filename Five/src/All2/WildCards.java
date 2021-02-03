package All2;


import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal (1));//создание нового животного
        listOfAnimal.add(new Animal (2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

    

    }

   /*
    private static void test (List<Animal> list){
        for (Animal animal : list){    //Принимает на вход list с животными
            System.out.println(animal);

    */
      private static void test (List<? extends Animal> list){    // передача любого объекта (лист объектов),
            // элементы которого являются animal либо другие классы, наследующие его.
            // super - либо класса animal либо выше
          // Object - Animal - Dog, super Animal = Animal + Object, extends = Animal + Dog

          for (Animal animal : list){    //Принимает на вход list с животными
              animal.eat();
        }
    }
}
