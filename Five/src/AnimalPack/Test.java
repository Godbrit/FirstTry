package AnimalPack;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat ();
        Dog dog = new Dog();
      //Animal animal = new Animal();  //данный класс - копцепция и не обязателен к использованию
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();
        dog.showInfo();


    }
}



