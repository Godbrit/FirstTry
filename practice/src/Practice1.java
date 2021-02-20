import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    private Double f;
    double min;
    double max;
    double avg;
    double avg3;
    static List<Double> list = new ArrayList<Double>();


    public Practice1() {

        for (int i = 0; i < 10; i++) {
            double f = Math.random() / Math.nextDown(1.0);
            list.add(f);
            if (i <= 0) {
                min = list.get(i);
            }
            double avg2 = avg3 + list.get(i);
            avg3 = avg2;
            avg = avg2 / (i + 1);
            if (max <= list.get(i)) {
                max = list.get(i);
            }
            if (min >= list.get(i)) {
                min = list.get(i);
            }

        }
        System.out.println("min " + min);
        System.out.println("max " + max);
        System.out.println("avg " + avg);
    }


    public static void main(String[] args) {

        Practice1 practice1 = new Practice1();
        practice1.puziruk();
        System.out.println(list);




    }

    public void puziruk() {

        System.out.println("");

        System.out.println(list);
        for (int j = 0; j < list.size()
                ; j++) {


            for (int i = 1; i < list.size()
                    ; i++) {


                    if (list.get(i) >= list.get(i - 1)) {
                        double temp = list.get(i);
                        double temp2 = list.get(i - 1);

                        list.add(i - 1, temp);

                        list.remove(i);
                        list.add(i, temp2);
                        list.remove(i + 1);
                    } else {
                    }


            }

        }


    }

}

