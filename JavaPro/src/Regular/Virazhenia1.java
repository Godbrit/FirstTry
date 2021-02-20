package Regular;

public class Virazhenia1 {
    public static void main(String[] args) {
        /*


        \\d - одна цифра                        ss
        \\w -одна английская буква
        \\w = [a-zA-Z]
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов < 0
        (x|y|z) - или, одна строка из множества строк
        \\  - перевод специального символ в обычную букву
        [abc] = (a|b|c)
        [a-zA-Z] - все английские буквы
        [^abc] - Отрицание символов
        . -      любой символ
        {2}   - 2 символа до (\\d{2}) 2 символа до
        {2, }  - 2 и более символа
        {2, 4} - от 2 до 4 символов
         */

        
        String a = "d";
        String b = "11";
        String c = "-1";
        String d = "+1";
        System.out.println(a.matches("\\d")); //совпадение строк
        System.out.println(a.matches("d"));
        System.out.println(b.matches("1\\d+"));
        System.out.println(b.matches("11\\d*"));
        System.out.println(c.matches("\\d*"));
        System.out.println(c.matches("-?\\d*"));
        System.out.println(d.matches("(-|\\+)?\\d*"));

        String e = "gss3311aaaaSSS123456";
        System.out.println(e.matches("[a-zA-Z32]+\\d+"));
        System.out.println(e.matches("[a-zA-Z31]+\\d+"));

        String f = "asdf";
        System.out.println(f.matches("[^abc]*"));
        System.out.println(f.matches("[^hyqwe]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String ee = "1w2w3www";
        System.out.println(ee.matches("\\d{3}www"));       //ровно 3 цифры




    }



}
