package Regular;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitClass {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String b = "ss213213ssssadasdas213213dsa234dsa123";
       String[] words = a.split(" "); //разделение строки по пробелам
        String[] words2 = b.split("\\d+");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));
        String c = "Hello there hey";
        String modifiedString = a.replace(" ", ".");//замена
        System.out.println(modifiedString);
        String modifiedString2 = modifiedString.replaceFirst("\\.", " ");//замена только первого символа
        System.out.println(modifiedString2);




    }
}
