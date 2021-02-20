package Regular;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherClass {
    public static void main(String[] args) {
        String text = "Здравствуйте.\n" +
                "\n" +
                "Выявлены длительные задержки при попытке получения данных по ЗСИБ ЖД.\n" +
                "\n" +
                "Также третьи сутки не можем выгрузить данные по хостам , Pog@gmail.comподверженным уязвимостям CVE-2020-0601 и CVE-2019-2281/1182, тоже по ЗСИБ:\n" +
                "\n" +
                "время загрузки достигает часа, после приходит сообщение об ошибке.\n" +
                "\n" +
                "tim@yandex.ru";
        Pattern email = Pattern.compile("((\\w+)@(gmail|yandex))\\.(com|ru)"); //создание паттерна
        Matcher matcher = email.matcher(text); //передача строки

        while (matcher.find()) {  //пока все совпадения не найдёт
            System.out.println(matcher.group(1)); //возвращение найденного методом find \\вывод только группы (группа)
            System.out.println(matcher.group());
            System.out.println(matcher.group(2));

        }


    }
}
