package All2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("People.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            FileInputStream fas = new FileInputStream("people2.bin");
            ObjectInputStream oas = new ObjectInputStream(fas);

            Person person1 = (Person) ois.readObject(); //Downcasting
            Person person2 = (Person) ois.readObject();
            /* Первый способ
            int personCount2;
            personCount2 = oas.readInt();
            Person[] people = new Person[personCount2];

            for (int i = 0; i < personCount2 ; i++) {
                people[i] = (Person) oas.readObject(); //индекс i
            }
            */



            Person[] people =(Person[]) oas.readObject();



            System.out.println(person1);
            System.out.println(person2);
            System.out.println(people);
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {    //нехватка класса для чтения файла
            e.printStackTrace();
        }
    }
}
