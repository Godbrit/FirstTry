package All2;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file);  //только текстовые значения
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Vvedite");
        System.out.println(scannerName);
        String age = scannerName.nextLine();
        System.out.println(scannerName);
        System.out.println(age);
        pw.println(age);
        pw.println(scannerName);
        pw.close();
    }

}
