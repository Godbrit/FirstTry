package Anonim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    //public static void main(String[] args) throws FileNotFoundException {//В ходе выполнения кода может возникнуть ошибка такого вида
      public static void main(String[] args)  {
        File file = new File ("kek");
          try {
              Scanner scanner = new Scanner(file);
              System.out.println("После сканнера");  //пропуск строк из-за ошибки
          } catch (FileNotFoundException e) {
              //e.printStackTrace();  //вывод сообщения об ошибке
              System.out.println("Файл не найден");

          }


          System.out.println("ПРодолжение");
          try {
              readFile();
          } catch (FileNotFoundException e) {
              System.out.println("Обработка");
          } ;

      }
      public static void readFile() throws FileNotFoundException {
          File file = new File("test");
          Scanner scanner = new Scanner(file);
      }
}
