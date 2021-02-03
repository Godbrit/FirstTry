package All2;

import Interfaces.PeronClass;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 5431277578486113313L;
    private int id;
    private String name;
    private transient String tech; //Несериализовывать поле, то есть null
    private int age;
    private byte tye;


    public Person(int id, String name, String tech){
        this.id = id;
        this.name = name;
        this.tech = tech;
            }
        public  int getId(){
        return id;
        }

    public  String getName(){
        return name;
    }

    public  String getTech(){
        return tech;
    }

    public  String toString(){
        return id + " : " + name + " null? " + tech;
    }
}
