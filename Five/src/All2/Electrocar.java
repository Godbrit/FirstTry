package All2;

public class Electrocar {
    private int id;
    private static String batterystring;
    // вложенный нестатических класс
    private class Motor{
        public void startMorot() {
            System.out.println("Motor" + id + " is starting");
        }
    }


    // Статическией вложенный класс, нет доступа к другим переменным, если они не статичны
    public  static class  Battery {
        public void Charge () {
            System.out.println("Battery is charging");
        }
    }


    public Electrocar(int id) {
        this.id = id;
    }


    public void start () {
        Motor motor = new Motor();
        motor.startMorot();
        final int x = 1; // Испольвать вложенный класс в методе можно только использую фитнальные значения переменных
        class someClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        someClass someClass = new someClass();
        test(someClass);

        System.out.println("Electrocar" + id + "is starting...");
    }


    private void test (Object object){

    }
}
