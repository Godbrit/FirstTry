package All2;

public class Test22 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        String string1 = "Hello";       // string1  -->
                                        //string Pool       {"Hello"}
        String string2 = "Hello";       // string2  -->

        String string3 = new String("Hello");
        //Не работает String Pool
        String string4 = new String("Hello");
        String string5 = "Hello1232132131".substring(0,5); // Считывать только первые 5 значений


        System.out.println(x == y);
        Animal1 animal1 = new Animal1(1);
        Animal1 animal2 = new Animal1(1);
        Animal1 animal3 = animal2;

        System.out.println(animal1 == animal2); //сравнение ссылок на объекты (его номер)
        System.out.println(animal3 == animal2);



        Object object = new Object();
        object.equals(animal1);  //

        System.out.println(animal2.equals(animal1)); //
        System.out.println(string1.equals(string2)); //
        System.out.println(string1 == string2); //
        System.out.println(string3 == string4);
        System.out.println(string3.equals(string4)); //

        System.out.println(string1 == string5);
        System.out.println(string1.equals(string5)); //
    }
}


class Animal1 {
    private int id;

    public Animal1 (int id)
    {
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal1 otherAnimal = (Animal1) obj; //DownCasting
        System.out.println(otherAnimal);
        return this.id == otherAnimal.id;
    }
}