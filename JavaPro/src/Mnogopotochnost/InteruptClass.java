package Mnogopotochnost;

import java.util.Random;

public class InteruptClass {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Random random = new Random();

                for (int i = 0; i < 1_000_000_000 ; i++) {
                    if (Thread.currentThread().isInterrupted())  ////возвращение текущего потока
                    {
                        System.out.println("Thread was interrupted");
                        break;
                    }
                        ;

                    Math.sin(random.nextDouble());



                }
            }
        });


        System.out.println("Starting Thread ");

        thread1.start();

        thread1.sleep(1000);

        thread1.interrupt(); // не останавливает поток, но передаёт сообщение о необходимости остановки
        //thread1.stop(); // Не рекомендуется


        thread1.join();

        System.out.println("Thread has finished");


    }
}
