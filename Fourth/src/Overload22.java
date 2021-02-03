public class Overload22 {
    public static void main(String[] args) {
    Overload22 overload22 = new Overload22();
    byte b = 5;
    short cc =2;
        overload22.kek(b);
        overload22.method(cc);
        }
        void  kek (int j){
            System.out.println("int");
        }
        void kek (long j) {
            System.out.println("long");
    }
    void  method (Integer j){
        System.out.println("Integer");
    }

    void  method (double j){
        System.out.println("double");
    }

    void  method (byte... j){
        System.out.println("byte");
    }
    void  method (Byte... j){
        System.out.println("Byte...");
    }
    void  method (Object... j){
        System.out.println("Object...");
    }
    void  method (Object j){
        System.out.println("Object");
    }
}

