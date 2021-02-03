public class ConstuctorExample {
    int i;
    void ConstructorExample (String s, int i) {
        this.i = i;
        System.out.println("run");
        System.out.println(s);
    }
    void ConstructorExample (int i) {
        this.i = i;
        System.out.println("run");
        System.out.println(i);
    }
    void ConstructorExample (String s) {
        this.i = i;
        System.out.println("run");
        System.out.println(s);
    }
    void ConstructorExample (String s, int i, boolean b) {
        this.i = i;
        System.out.println("run");
        System.out.println(s);
        System.out.println("Fuck you");
    }
    void ConstructorExample (String s, boolean b) {
        this.i = i;
        System.out.println("run");
        System.out.println(s);

    }


}

class Run {
    public static void main(String[] args) {
        ConstuctorExample constructorExample = new ConstuctorExample();
        constructorExample.ConstructorExample("hello", 5);
        System.out.println(constructorExample.i);
    }
}
