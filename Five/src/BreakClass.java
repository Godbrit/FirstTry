public class BreakClass {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
                i++;
                if (i == 15) {
                    System.out.println(i);
                    break; //выход из цикла

            }
        }
        for (int j = 0; j <=15 ; j++) {
            if (j%2==0){   //остаток от деления
                System.out.println(j);
                continue;  // всё что следует после continue не выполняется

            }
            System.out.println(j);
        }



    }
}