package Anonim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; //разделитель пути в системе

        String path =  "H:" + separator + "test.txt";
        String path2 =  "H:" + separator + "test2.txt";

        File file = new File(path);   //абстракция для работы файла, (путь до файла)
        File file2 = new File(path2);
        File file3 = new File("test");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

     //   String input = scanner.nextLine();
        Scanner scanner2 = new Scanner(file);
        String line = scanner2.nextLine();
        String [] numbers =  line.split("   "); //аргумент-разделитель массив.
        System.out.println(Arrays.toString(numbers));
        Scanner scanner3 = new Scanner(file2);
        String line2 = scanner3.nextLine();
        String [] numbers2 =  line2.split(" ");
        System.out.println(Arrays.toString(numbers2));
        int[] numbers4= new int[10];
        int counter = 0;
        System.out.println(Arrays.toString(new File[]{file3}));

        for (String number: numbers2
             ) { numbers4 [counter++] = Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers4));


        scanner.close();
    }
}
