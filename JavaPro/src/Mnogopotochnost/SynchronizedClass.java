package Mnogopotochnost;

import java.util.Scanner;

public class SynchronizedClass {
    private int counter;
    private int counter2;

    public static void main(String[] args) throws InterruptedException {
        SynchronizedClass test = new SynchronizedClass();
        test.doWork();
        test.doWork2();
    }


    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    counter++;
                counter = counter + 1;

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    counter++;
                counter = counter + 1;

            }
        });
        thread1.start();
        thread2.start();

        thread1.join();    //ожидание завершение потока
        thread2.join();

        System.out.println(counter); // часть инкрементов теряется из-за того, что потоки не связаны между собой+
    }

    public void doWork2() throws InterruptedException {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    increment();

            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    increment();
            }
        });
        thread3.start();
        thread4.start();

        thread3.join();    //ожидание завершение потока
        thread4.join();

        System.out.println(counter2); // часть инкрементов теряется из-за того, что потоки не связаны между собой
    }

    public synchronized void increment() {               //синхронизированный поток
        counter2++;
        counter2 = counter2 + 1;

    }

    public void increment2() {               //синхронизированный поток
        synchronized (this) {  //синхронизированный блок
            counter2++;
        }

    }
}

