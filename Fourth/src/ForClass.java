

public class ForClass {
    public static void main(String[] args) {
       int [] arr = {3,2,2};
       boolean m = false;
        for (int j = 0, p =2; j < arr.length && !m == true; System.out.println("end cycle"), j++) // объявление переменных через "," одного типа; boolean true;  //конец цикла
        {

            System.out.println(j + " " + arr[j]);

        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
