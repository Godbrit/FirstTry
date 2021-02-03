package All3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {


    Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());
        System.out.println(animal);


          switch (animal){
        case DOG:
            System.out.println("Its a " + animal.getTranslation());
            break;
        case CAT:
            System.out.println("Its a " + animal.getTranslation());
            break;
        case Frog:
            System.out.println("Its a " + animal.getTranslation());
            break;
        default:
            System.out.println("WTF");
          }

        Seasons seasons = Seasons.SPRING;
        System.out.println(seasons.getX());
        System.out.println(seasons.name()); //Возвращение значения переменной


          // Object -> Enum -> Season

        System.out.println(seasons instanceof Seasons);  //является ли seasons объектом Seasons
        System.out.println(seasons instanceof Enum);


        Seasons winter = Seasons.WINTER;
        System.out.println("Под номером " + winter.ordinal()); //Индекс в enum



        switch (seasons){
            case SPRING:
                System.out.println("Its a Okay");
                break;
            case SUMMER:
                System.out.println("Its a warm");
                break;
            case WINTER:
                System.out.println("Its cold");
                break;
            default:
                System.out.println("WTF");
        }
    }
}
