import java.util.ArrayList;

public class Pracrice13 {
    static ArrayList<Integer> list = new ArrayList<>();
    static int j = 3;
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            list.add((int)(Math.random()*10));

        }
        System.out.println(list);
        Practice13(3);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==j){
                list.remove(i);
            }

        }
        System.out.println(list);

    }
 static void Practice13(int j) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == j) {
                list.remove(i);
            }

        }
    }


}
