import java.util.Date;

public class Switch {
    enum Days {MONDAY,THUESDAY,WEDNESDAY}
    public static void main(String[] args) {


        int i =5;
        Days days = Days.THUESDAY;
        switch (days) {
            case MONDAY:
                System.out.println("Mondorin1");
                break;
            default:
                System.out.println("default");
                break;

        }

         switch (i) {
             default:
                 System.out.println("default");
                 break;
             case 3:
                 System.out.println(333);
                 break;
             case 5:
                 System.out.println(555);
                 break;
             case 6:
                 System.out.println(777);
                 break;
         }
         String s = "netop";
         switch (s){
             case "ss":
                 System.out.println(2);
             default:
                 System.out.println("default");
             case "top":
                 System.out.println("net");




        }
    }
}
