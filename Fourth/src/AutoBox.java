import java.util.ArrayList;
import java.util.List;
public class AutoBox {
    public static void main(String[] args) {

        Integer o = new Integer(5);
        int j = new Integer("22222222");
        System.out.println(j);
        int k = Integer.parseInt("23"); //из строчки возвращает int
        Integer q = o.valueOf("3");   // возвращает Integer
        short ss = o.shortValue(); //конвертация значения o в short значение ss
        System.out.println(ss);

        Integer i = new Integer(5);
        Integer qq = 5; // Тоже самое, что и Integer i = new Integer(5);
        i++; //         int tempVar=i.intValue();         tempVar++;            i=new Integer(tempVar);
        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        for (int kk : list) {
            System.out.println(kk);
        }
        String s = "string";
        String s2 = "string";
        String s3 = new String("string");
        Integer i1 = (5);
        Integer i2 = (5);
        Integer i3 = new Integer(5);
        Object o1 = new Object();
        Object o2 = new Object();
        if (o1.equals(o2)) //сравневание объектов ==ы
        {
            System.out.println("==");
        }
        if (s.equals(s2))
        {
            System.out.println("==2");
        }
        if (s3 == s2)
        {
            System.out.println("==3");
        }
        if (i1.equals(i2))
        {
            System.out.println("==1");
        }
        if (i2.equals(i3))
        {
            System.out.println("==2");
        }
        if (i3 == i2)
        {
            System.out.println("==3");
        }
    }

    class My2Class

    {
        public boolean equals(Object obj) {
            return (this == obj);
        }
    }
    Object method(){
        return 1;


    }

    }


