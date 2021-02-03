import java.util.List;

public class Main3 extends Object{

    public static void main(String[] args){
        int a=5;
        int b=4;
        System.out.println(a+b/a*b-b);
        a= a+6 ; //a+=6
        System.out.println(a);
        a-=6;
        System.out.println(a);
        System.out.println(5>=6); //boolean
        System.out.println(5==5.0);// сравнение разных типов присутствует
        Object o = new Object();
        Object o2 = new Object();
        System.out.println(o == o2); // ссылки на объект разные, так как адреса в памяти разные
        System.out.println(o);
        Main3 main3 = new Main3();
        System.out.println(main3 instanceof Main3); //находится ли данный фрагмент в классе
        System.out.println(main3 instanceof List);
        String s = "bla";
        System.out.println(s + " TO YOU"); // + добавляет одно к другому
        System.out.println("" + 5 + 6); // Изначльно значение в string
        System.out.println(5+6 + ""); // Изначально значение в int
        int d =5;
        d++; //увеличение на 1
        System.out.println(d);
        System.out.println(d++ + ++d); //при использование ++d вначале происходит прибавление 1 к переменной, а после уже сумма.
        System.out.println(d);
        int n = (a>b)? 1+4 +5 :2 - 8 + 5 + 6 ; // если true, то 1 значение, если false то 2 значение
        System.out.println(n);

        System.out.println(true && 6>5 &&false); //сравнение boolean значений. Если одно из них false, то возврщается false
        System.out.println(returnBool() || 6>5 | returnBool2()||returnBool2());// Хотя бы одно значение true.
        //При использование одинарного | идет проверка только до первого true значения
        System.out.println(!true); //false
        System.out.println(5>6 ^ 6>5); //проверка на разных операторов boolean

    }
    private static boolean returnBool(){
        System.out.println("return");
        return false;
    }

    private static boolean returnBool2(){
        System.out.println("return2");
        return true;
    }
}
