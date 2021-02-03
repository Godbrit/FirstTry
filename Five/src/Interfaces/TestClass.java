package Interfaces;

public class TestClass {
    public static void main(String[] args) {
        AnimalClass animal1 = new AnimalClass(1);
        PeronClass person1 = new PeronClass("BOb");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();
        Info info1 = new AnimalClass(1);   //полиморфизм
        Info info2 = new PeronClass("Bob");
        info1.showInfo();
        info2.showInfo();
        outputInfo(animal1);
        outputInfo(person1);


    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
}
