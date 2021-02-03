import java.util.Scanner;

public class Methods extends Person{
    //Person person1 = new Person();
    //int ageAge = person1.yourAge();
    public static void main(String[] args) {
        Person person1 = new Person();
       // int years = new Methods().calculateYears();

        //person1.name = "Моё имя";
        //person1.age = 30;
        String nameName = person1.yourName();
        person1.yourAge();
        int ageAge2 = person1.age;
        int year1 = person1.calculateYears();

        System.out.println("Ваше имя " + nameName + " и ваш возраст " + ageAge2 + ". До пенсии осталось "  + year1);
       // person1.speak();



    }

  //  int calculateYears() {
    //    Person person1 = new Person();

      //  int years = 65 - ageAge;
       // return years;
    //}
    }




  class Person {
    String name;
    int age;

        String yourName() {
            Scanner scannerName = new Scanner(System.in);
            System.out.println("Введите имя");
            String j = scannerName.nextLine();
            return j;
        }



      void  yourAge() {
          Scanner scannerAge = new Scanner(System.in);
          System.out.println("Введите ваш возраст");
          int l = scannerAge.nextInt();
          age = l;



     }


      int calculateYears(){
          int years = 65 - age;
          return years;
      }







  }
