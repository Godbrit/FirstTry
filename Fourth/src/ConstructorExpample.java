import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class ParentConstructor {
    ParentConstructor(int i)
    {
        System.out.println("ParentConstructor");
    }
    ParentConstructor() {
        System.out.println("DefaultParentConstructor");
    }
}

public class ConstructorExpample extends ParentConstructor {
       ConstructorExpample(int i){
        ParentConstructor parentConstructor = new ParentConstructor(i);

       System.out.println(parentConstructor);

            }
    ConstructorExpample(){
        System.out.println("ConstrucrorExample");
    }



    public static void main(String[] args) {
        new ConstructorExpample();
 //       new ParentConstructor(i);
    }
}
