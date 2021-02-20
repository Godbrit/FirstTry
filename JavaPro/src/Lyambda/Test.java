package Lyambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

interface Executable {
    int execute(int x, int y);
}



class Runner{
    public void run(Executable e){

        int a = e.execute(10, 15);
        System.out.println(a);
    }
}
class ExecutableImplementation implements Executable {

    @Override
    public int execute(int x, int y) {
        System.out.println("Hello");
         return x + y;

    }
}

public class Test {
    public static void main(String[] args) {

        Runner runner = new Runner();
        int b = 2;
        runner.run(new ExecutableImplementation()); //передача объекта
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                int b = 3;  //возможно переопределение переменной, в отличие от лямбды
                System.out.println("Hello");
                return x + 1;
            }
        });
        runner.run((x,y) -> {System.out.println("Hello");
        return x + y;});
        runner.run((x,y) -> x + 12); // если в одной строке, то фигурные скобки не нужны
        final int a = 1;
        runner.run((x,y) -> x + 12 + a); //возможно использование переменной, которой является final


        //////////////////////////////////////////////////////////////////////////////
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hl");
        list.add("Bye222222");
        list.add("Good");
        list.add("abv");
        list.add("Helo");

        Comparator<String> comporator = (s1, s2) -> {
        //list.sort((s1,s2) -> {
            if (s1.length() >s2.length())   return 1;
            if (s1.length() < s2.length())   return -1;
            else  return 0;
        };
        System.out.println(list);




    }
}




