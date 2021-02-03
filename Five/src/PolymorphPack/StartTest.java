package PolymorphPack;

public class StartTest {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal1 = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal1.eat();
        animal.eat();            //Если реализация в потомке имеется оно вызвется
        dog.eat();
        dog.bark();
        //animal.bark(); // Специфичные методы в собаке не учитываются
        test(animal1);
        test (dog);
        test (cat);
        Animal animal2 = dog;//Upcasting - Восходящие преобразование
        Dog dog2 = (Dog) animal2; //явное указание на объект в классе Dog
        dog2.bark();
        Animal a4 = new Animal();
        Dog d4 = (Dog) a4;   //нисходящее преобразование
        d4.bark();
    }
    public static void  test(Animal animal) {
        animal.eat();
    }

}
