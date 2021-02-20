package ALL1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCodeClass {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Map<Person, String > map1 = new HashMap<>();
        Set<Person> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Integer x =1;
        x.equals(map);
        x.hashCode();


        map.put(1, "Один2");
        map.put(2, "Два");
        map.put(1, "Один");

        set.add(2);
        set.add(2);

        System.out.println(map);
        System.out.println(set);

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(2, "Katy");
        Person person3 = new Person(1, "Mike");
        person1.equals(person2);   //сравнение ссылок на объекты
        person1.hashCode();  // native - реализован на C++, также считывает ссылки на объекты

        map1.put(person1,"123");
        map1.put(person2,"223");
        map1.put(person3,"23323");


        set1.add(person1);
        set1.add(person2);
        set1.add(person3);
        System.out.println(map1);  //так как разные ссылки на объекты, показываются одинаковые имена
        System.out.println(set1);
        set2.add ("Hello");
        set2.add ("Hello");
        System.out.println(set2);

    }


}

class Person
{
    private int id;
    private String name;

    public Person (int id, String name){
        this.id = id;
        this.name = name;
        }
        @Override
    public String toString(){
        return "Person{" + "id" + id + ", name =' " + name + '\'' + "}";

        }
//Сравнение полей




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;   //если не равны id then false
        return name != null ? name.equals(person.name) : person.name == null; //если не равны name then false
    }
// {object} -> {int}


    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
    Контракт hashcode() equals()
    1)У двух объектов вызываем hashcode
    Если хэши разные -> два объекта разные.

    2)если хэши одинаковые -> два одинаковые объекта либо коллизия -> equals();

    3) equals() - выдает точный ответ
     */
}
