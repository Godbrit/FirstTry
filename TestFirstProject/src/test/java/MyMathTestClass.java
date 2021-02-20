import org.junit.Test;

public class MyMathTestClass {
    @Test(expected = ArithmeticException.class)
    public void zeroDominatorShouldThrowException(){
            MyMathClass.divide(1,0);



    }
}
