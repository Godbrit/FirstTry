public class IfElse {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        boolean ab = true;
        boolean ba =false;

        if (a>b) //если true то в выражение можно поставить только boolean выражения
        {
            System.out.println(a);
        }
        if (ab == ba)
        {
            System.out.println(b);
        }
        else {
            System.out.println("nope");
        }

    }
}

