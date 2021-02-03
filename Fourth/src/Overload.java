import java.io.IOException;

public class Overload {
    int addTwoDigits(int a, int b) throws IOException
{ return a + b;
}
    double addTwoDigits(double a, double b ) throws RuntimeException
    {
        return a + b;
    }

    public static void main(String[] args) throws Exception {
        OverloadChild overload = new OverloadChild ();
        System.out.println(overload.addTwoDigits(5,6));
        System.out.println(overload.addTwoDigits(5.6,6.6));
        overload.addTwoDigits(5);
    }
}

class OverloadChild extends Overload
        {
void addTwoDigits (int j) {
    System.out.println("overload method");
}
        }

