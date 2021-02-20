import java.util.ArrayList;

public class Pracrice12 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Massive();
        System.out.println(3%2);

    }

    public static void Massive(){
        boolean bool = false;
        for (int i = 2; i <100 ; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (    Integer arrayList:list
             ) {
            outer1:{

                       for (int j = 2; j < arrayList; j++) {


                           outer3:
                           if (arrayList % (j) == 0) {
                               bool = false;
                               break outer1;
                           } else if (arrayList % (j) != 0) {
                               bool = true;
                               break  outer3;
                           }

                       }


                       }
            if (bool == true)
                System.out.println(arrayList);
                       }
                   }
               }

  //          System.out.println(arrayList);





