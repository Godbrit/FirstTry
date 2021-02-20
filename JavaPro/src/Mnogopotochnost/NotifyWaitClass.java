package Mnogopotochnost;

import java.util.Scanner;

public class NotifyWaitClass {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}
class WaitAndNotify{
    public void produce() throws InterruptedException {
        synchronized (this) {   //Объект wn
            System.out.println("Producer thread started...");
            //вызывается только в пределах синхранизованного блока с привязкой на this, при необходимости object.wait
            wait();  // 1 - отдаем intrinsic lock (монитор объекта), 2 - ожидания вызова notify именно на этом объекте

            System.out.println("Producer thread resumed...");
        }

    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this){
            System.out.println("Waiting...");
            scanner.nextLine();
            notify(); // пробуждение одного потока
            //notifyAll(); // пробуждение всех потоков

            Thread.sleep(5000);
        }




    }

}
