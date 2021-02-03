package All2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Primityve {
    public static void main(String[] args) {
        float f = 123.2F;
        float f1 = (float)213.2;
        long l = 232232323232323232L;

        int a = 2;

        long one =a;  //неявное привидение прмитивное типа данных
        int x = (int) l;  //явное привидение прмитивное типа данных
        System.out.println(x);
        double x2 = a;
        System.out.println(x2);
        int x3 = (int) f;
        System.out.println(x3);
        long y = Math.round(f1);
        System.out.println(y);

        byte b = (byte)155;   //-128 - 127
        System.out.println(b);   // уход в самый конец byte

        Integer x5 = new Integer(123); //с помощью примитивов можно воспользуется функциями досутпные через x.y
       int x6 = Integer.parseInt("123");    //Приведение string к Integer

    }
}
