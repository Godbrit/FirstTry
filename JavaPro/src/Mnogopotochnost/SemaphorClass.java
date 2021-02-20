package Mnogopotochnost;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphorClass {
    public static void main(String[] args) throws InterruptedException {

        /*

        Semaphore semaphore = new Semaphore(3); //число - количество разрешений для потоков, сколько потоков одновременно могут воспользоваться.

        try {
            semaphore.acquire(); //взаимодействие с ресурсом
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("All permits have been acquired");

//            semaphore.acquire();



        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release(); //выпускает семафор, после окончания взаимодействия с ресурсом.

        System.out.println(semaphore.availablePermits()); //количество доступных разрешений
*/

        ExecutorService executorService = Executors.newFixedThreadPool(2000);
        Connection connection = Connection.getConnection();

        for (int i = 0; i <200 ; i++) {
            executorService.submit(new Runnable(){


                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }

        executorService.shutdown(); //окончание submit
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }

}


//Singleton

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10); //максимальбное число разрешений -10


    private Connection () {


    }

    public static Connection getConnection(){
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();                       //взятие потока
        try {
            doWork();                               //В любом случае будет освобождаться поток
        } finally {
            semaphore.release();                        //освобождение потока
        }


    }


   private void doWork() throws InterruptedException {
        synchronized (this){
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        Thread.sleep(5000);

        synchronized (this){
            connectionsCount--;
        }


    }

}