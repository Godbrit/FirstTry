public interface SomeIterface extends IOtherInterface {
    int SOME_CONST = 5;
    void addTwoDigits (int one, int two);
    void method ();

}
interface IOtherInterface {
    void someMethod ();
}

interface Bancable {
    void bounce ();
}


abstract class Example implements SomeIterface, Bancable {
    @Override
    public void addTwoDigits (int one, int two) {
       // SOME_CONST = 5;

    }
    public void someMethod(){

    }
    public void bounce() {

    }
}