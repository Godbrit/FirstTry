import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.omg.SendingContext.RunTime;

import java.io.IOException;
import java.io.File;


public class ExceptionClass {
    public static void main(String[] args) throws IOException {
        new ExceptionClass().someMethod();
        new ExceptionClass().exceptionMethod();
        new ExceptionClass().createMethod2();

        try {


        new ExceptionClass().exceptionMethod2();
    }catch (IOException e) {
        }
        finally{
        }

        }


    void someMethod() {
        try {   // exception
            Object o = null;
            o.hashCode();
         throw new IOException(); //создание исключения Input Output
        }
        catch (IOException e) {     //отлов exception, если exception найдёт, то выполняется, всё что внутри.
            e.printStackTrace();    //выводить ошибки
        }
       catch (NullPointerException e) {     //отлов exception, если exception найдёт, то выполняется, всё что внутри.
     e.printStackTrace();    //выводить ошибки
    }
    catch (ArrayIndexOutOfBoundsException e) {     //отлов exception, если exception найдёт, то выполняется, всё что внутри.
            try {
                throw new ArrayIndexOutOfBoundsException();
            }
                catch (RuntimeException err) {    //выводить ошибки
                    err.printStackTrace();    //выводить ошибки

                }

        }
        catch (RuntimeException e) {     //отлов exception, если exception найдёт, то выполняется, всё что внутри.
            e.printStackTrace();    //выводить ошибки
            throw new Error();    // создание еррора, не рекомендуется делать в try/catch
        }



        finally
         {                             // необходимо, чтобы в дальнейшем закрывать коннекты, происходит независимо от того произошёл ли блок try
            System.out.println("finally");
            //System.exit(0);  // прерывание команды
            throw new RuntimeException();
        }

      //  System.out.println(2);
    }

    void exceptionMethod(){
        try{
        throw new IOException();
    } catch (IOException e)
        {

        }

    }
    void exceptionMethod2() throws IOException, RuntimeException{  //передачи проблемы наверх.
        throw new IOException();
    } //
    void createMethod2() throws IOException
    {
        File file = new File ("");
        file.createNewFile();   //так как из-за каких-то проблем с созданием необходимо ловить такие исключения и выдавать наверх
        }
    void createMethod() {
        //throw new Throwable(); //глава Иерарзии является checked
        //throw new Exception(); //является checked
        //throw new IOException(); //является checked
        //throw new Error();      //является unchecked не проверяются  компилятором
       // throw new RuntimeException(); //является unchecked


    }
}