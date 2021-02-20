package ALL1;

import java.util.*;

public class ComparatorClass {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("ke");
        animals.add("w");


        Collections.sort(animals);//сортировка массива
        System.out.println(animals);
        System.out.println("");
        for (int i = 0; i <(animals.size()/2) ; i++) {
            String temp = animals.get(i);
            Integer temp3 = animals.size() - 1 - i;
            String temp1 = animals.get(temp3);
            animals.set(i, temp1);
            animals.set(temp3,temp);
            }

        System.out.println(animals);
        System.out.println("");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(05);
        numbers.add(500);
        numbers.add(1);
        Collections.sort(numbers);//сортировка массива
        System.out.println(numbers);

        Collections.sort(animals, new StringLengthComparotor()); //использование нашего класса
        System.out.println("");
        System.out.println(animals);
        System.out.println("");

        Collections.sort(numbers, new Comparator<Integer>(){ @Override   //анонимный клас
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2)
                return -1;
            else if (o1 < o2)
                return 1;
            else return 0;

        }}); //использование нашего класса
          System.out.println(numbers);
        List<Person2> people = new ArrayList<>();
        people.add(new Person2(1, "Bob"));
        people.add(new Person2(2, "Bob2"));
        people.add(new Person2(3, "Bob3"));

        Collections.sort(people, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                if (o1.getId() > o2.getId())
                    return -1;
                else if (o1.getId() < o2.getId())
                    return 1;
                else return 0;
            }

        });
      //  System.out.println(people);
    List<Person3> people3List = new ArrayList<>();
    Set<Person3> people3Set = new TreeSet<>();

    addElements(people3List);
    addElements(people3Set);

    Collections.sort(people3List);


        System.out.println("");
        System.out.println(people3List);
        System.out.println("");
        System.out.println(people3Set);
        System.out.println("");
        }
    private static void addElements(Collection collection){
        collection.add(new Person3(1,"Tom"));
        collection.add(new Person3(3,"Tom3"));
        collection.add(new Person3(2,"Bob"));
    }
    }




class StringLengthComparotor implements Comparator<String>{  // использование интерфейса, желательно использовать анонимные классы для одиночных связок (тот кто сравнивает)

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length())
                return -1;
        else if (o1.length() > o2.length())
            return 1;
        else return 0;

        /*
         o1 > o2 => 1  o1<o2 => -1   o1 == o2 = 0
         compare (2, 4) => -1;
         */
    }




}

class Person2{
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class Person3 implements Comparable<Person3>{  //годящийся для сравнения
    private int id;
    private String name;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person3 person3 = (Person3) o;

        if (id != person3.id) return false;
        return name != null ? name.equals(person3.name) : person3.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person3 o) {    //Способность сравневания
        if (this.id > o.getId())
            return 1;
        else if (this.id < o.getId())
            return -1;
        else return 0;
    }
}
