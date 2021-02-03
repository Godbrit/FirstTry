class ParentInit {
    static {
        System.out.println("Static Parent Constructor");
    }
    ParentInit() {
        System.out.println("Parent Constructor");
    }
}

public class InitExample extends ParentInit {

    static
    {
        System.out.println("static init block");
    }
    {
        System.out.println("init block");
    }
    InitExample(){
       System.out.println("construction");
    }

    public static void main(String[] args) {
      new InitExample();

    }
}
