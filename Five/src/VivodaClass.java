public class VivodaClass {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(" my "); // Следующий вывод будет с новой строки
        System.out.printf("%f This is %s a string, %d \n", 10.2, "Nice", 10 );//Параметр строки, %s - переменная типа стринг %d - digit - цифра.
        System.out.printf("String %5d \n" , 532 ); //Ширина числа расчёт с правой стороны
        System.out.printf("Digital %5d \n", 22333);
        System.out.printf("Digital %-5d \n", 22333222);   // ширина с левой стороны
        System.out.printf("Digital %-5d \n", 22);
        System.out.printf("Digital %.2f \n", 22.22222); // значения после запятой + округление
    }
}
