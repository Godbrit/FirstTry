package Interfaces;

public class PeronClass implements Info {
    public String name;

    public PeronClass(String name) {
        this.name = name;
    }

    public void sayHello(){
                System.out.println("Hello");
            }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
    }

