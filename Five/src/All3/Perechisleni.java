package All3;

public class Perechisleni {
    //Без enum
    private  static final int DOG = 0;
    private  static final int CAT = 1;
    private  static final int Frog = 2;


    public static void main(String[] args) {
            int animal = DOG; //нет возможности узнать переменную по числу.

            switch (animal){
                case DOG:
                    System.out.println("Its a Dog");
                    break;
                case CAT:
                    System.out.println("Its a Cat");
                    break;
                case Frog:
                    System.out.println("Its a Frog");
                    break;
                default:
                    System.out.println("WTF");
            }



    }

}
