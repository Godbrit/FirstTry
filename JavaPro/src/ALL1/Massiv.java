package ALL1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Massiv {
    public static void main(String[] args) {
        int [] x = new int [3];
        int y = 10;
        ArrayList<Integer> arrayList = new ArrayList<>();
      //  arrayList.add(1);
        List<Integer> list = new ArrayList<>();  // рекомендуется так создавать массивы

        for (int i = 0; i < y ; i++) {
            arrayList.add(i);
            list.add(i);
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(y-1));
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("");
        System.out.println("next");
        System.out.println("");
        for (Integer c: arrayList
             ) {
            System.out.println(c);


        }
        arrayList.remove(5); // уменьшается размер массива с удалением значения. Удаление вначале требует большого количества времени из-за того, что необходимо время на обработку нового массива
        System.out.println(arrayList);
        //для проведения удалений из листа
        list = new LinkedList<>();






    }
}
