
//java.lang импортируется по умолчанию
//java.util. необходимо импортьровать

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        String s = new String("2fddfdf");  //класс, переменная, = new - новый объект класса
        Scanner b = new Scanner(System.in); //поток входных данных; b - ссылается на класс Сканнер
        System.out.println("Введите пароль");
        String j = b.nextLine(); //Пока не нажём на Enter
        System.out.println("Это ваш пароль " + j);

        System.out.println("Введите цифры");
        Scanner by = new Scanner(System.in);
        int byby = by.nextInt(); //Пока не нажём на Enter
        System.out.println("Это ваша цифра " + by);
    }
}
