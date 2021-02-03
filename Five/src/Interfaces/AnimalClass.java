package Interfaces;

public class AnimalClass implements Info{  //Реализуют, то есть обязаны реализовывать метод в Info
    public int id;

public  AnimalClass(int id){
    this.id = id;
}
    public void sleep()
    {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
