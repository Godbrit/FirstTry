public class Assertions {
    public static void main(String[] args) {
    new Assertions().assertMethod(2);
    }


    private static void assertMethod(int a) {
        assert (a < 0);  // если данное условие не произойдёт, то выброситься session error
        //do something
        System.out.println("kek");  // для просмотра ошибка необхомо вести аргумент -ea
    }
}

