


package Mnogopotochnost;


import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerClass {

    private static BlockingQueue queue = new ArrayBlockingQueue<>(10);  //очередь, потокобезопасная с предельным размером

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
    });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void produce() throws InterruptedException {
        Random random = new Random();


        while (true) {
            try {
                Thread.sleep(500);
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void consumer(){
        Random random = new Random();

        while (true) {
              try {


                  Thread.sleep(80);


                //queue.take();   //ожидание элементов
                  System.out.println("SIIIIII " + random.nextInt(10));
                  if (random.nextInt(10) == 5) {


                      System.out.println(queue.take());
                      System.out.println("Queue size is " + queue.size());
                  }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }


}
