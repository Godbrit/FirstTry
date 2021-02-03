package All2;

import java.io.*;

public class WriteObject implements Serializable {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob", "kekw");
        Person person2 = new Person(2, "Mike","kekL");
        Person[] people = {new Person(3, "Tom", "KekL"), new Person(4, "Tommy", "KekW"), new Person(5, "Babich", "KekE"),};

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("People.bin"))) {  //автозакрытие потока
            FileOutputStream fos = new FileOutputStream("People.bin"); //Сериализация объектов в файл, записывает байты в файл
            ObjectOutputStream oos = new ObjectOutputStream(fos); //Объект. // Запись объектов в файл, но необходим файл в байтах
            FileOutputStream fas = new FileOutputStream("people2.bin");
            ObjectOutputStream oas = new ObjectOutputStream(fas);
            //запись объектов в файл
            oos.writeObject(person1);
            oos.writeObject(person2);


            /* Первый метод

            oas.writeInt(people.length); //длина массива
            for (Person person : people
            ) {
                oas.writeObject(person);

            }
            */

            oas.writeObject(people);


            oos.close();   //закрытие потока
            oas.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
