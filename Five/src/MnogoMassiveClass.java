import java.util.SortedMap;

public class MnogoMassiveClass {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        System.out.println( numbers[1]);
        int[][] matrica = {{1,2,3},{3,2,2},{4,56,7}};
        System.out.println(matrica[2][1]);

        int[] numbers2 = new int [5]; // массив из 5 чисел

        String[][] strings = new String[2][3];
        strings[0][1] = "Privet";
        System.out.println(strings[0][1]);
        System.out.println(strings[0][2]);

        for (int i = 0; i < matrica.length ; i++) {
            for (int j = 0; j <matrica[i].length ; j++) {
                System.out.print(matrica[i][j] + ", ");
            }
            System.out.println();
        }

    }

}
