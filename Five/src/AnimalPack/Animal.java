package AnimalPack;

public abstract class Animal {
    public void eat(){
        System.out.println("I am eating");
    }

    public abstract void makeSound();  // только в Абстрактных классах можно использовать абстрактные методы
}
