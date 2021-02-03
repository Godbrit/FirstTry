public class ObjectClass {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str);
        Human22 human = new Human22();
        System.out.println(human.toString());
        Human2 h1= new Human2();
        System.out.println(h1.toString());
    }


    static class Human22{
      private String j;
      private int s;
      public Human22 (){
          System.out.println("kek");
      }
    }

    static class Human2{
        private String j;
        private int s;
        public Human2 (){
            System.out.println("kek");
        }
        public String toString(){
            s = 30;
            j= "Jija";
            return s+ "," + j;

        }
    }

}


