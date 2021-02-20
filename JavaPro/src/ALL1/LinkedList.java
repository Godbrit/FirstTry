package ALL1;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class LinkedList {
    public static void main(String[] args) {
       Personals persona1 = new Personals(1);
        Personals persona2 = new Personals(2);
        Personals persona3 = new Personals(3);
        Personals persona4 = new Personals(4);
        Personals persona5 = new Personals(5);

        Queue<Personals> people2 = new java.util.LinkedList<>(); //очередь бесконечнодлинная        //first in first out
        Queue<Personals> people = new ArrayBlockingQueue<Personals>(3); // максимальный размер очереди
        people.add(persona3);
        people.add(persona1);
        people.add(persona4); //метод выбрасывает исключение
        people.offer(persona5); //не выбрасывает исключение, но не добавляет в очередь
        people.offer(persona2);
        people.offer(persona1);

        System.out.println(people);
        System.out.println("");
        for (Personals persona: people
             ) {
            System.out.println(persona);
        }
        System.out.println("");
        System.out.println(people.remove()); //первый в очереди удален
        System.out.println(people.peek()); //вывод первого
        System.out.println(people);






    }
}

class Personals{
    private int id;

    public Personals(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "personals{" +
                "id=" + id +
                '}';
    }
}